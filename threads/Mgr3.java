package threads;

class ThreadA extends Thread
{

	public void run() {
		for(int i=0;i<=50;i++)
		{
			System.out.println(i);
		}
	}
}
class ThreadB extends Thread
{
	
	public void run() {
		for(int i=51;i<=100;i++)
		{
			System.out.println(i);
		}
	}
}
/**
 * @author chandra
 *
 */
public class Mgr3 {
public static void main(String[] args) {
	ThreadA t1=new ThreadA();
	t1.start();
	
	ThreadB t2=new ThreadB();
	t2.start();
}

}
