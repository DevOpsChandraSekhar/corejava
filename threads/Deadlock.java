package threads;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author chandra
 *
 */
class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class Shared
{
synchronized void test1(Shared s)
	{
		System.out.println("test1 begin");
		Util.sleep(1000);
		s.test2(this);
		System.out.println("test1 end");
	}

synchronized void test2(Shared s)
{
	System.out.println("test2 begin");
	Util.sleep(1000);
	s.test1(this);
	System.out.println("test2 end");
}
}
class A extends Thread
{
	Shared s1,s2;
	A(Shared s1,Shared s2)
	{
		this.s1=s1;
		this.s2=s2;	
	}
	public void run() {
		s1.test1(s2);
	}
}

class B extends Thread
{
	Shared s1,s2;
	B(Shared s1,Shared s2)
	{
		this.s1=s1;
		this.s2=s2;	
	}
	public void run() {
		s2.test2(s1);
	}
}
public class Deadlock 
{
 public static void main(String[] args) {
	Shared s1=new Shared();
	Shared s2=new Shared();
	 A a1=new A(s1,s2);
	 B b1=new B(s1,s2);
	a1.start();
	b1.start();
	ThreadMXBean mx=ManagementFactory.getThreadMXBean();
	long ids[]=mx.findDeadlockedThreads();
	if(ids!=null)
	{
		ThreadInfo x[]=mx.getThreadInfo(ids);
		
		for(ThreadInfo info: x)
		{
			System.out.println(info.getThreadName());
		}
	}
	else
	{
		System.out.println("no thread are locked");
	}
	
}
}
