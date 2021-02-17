package threads;

class E extends Thread
{
	public void run() {
		for(int i=0;i<=25;i++)
		{
			System.out.println(i);
			start();
		}
	}	
}

/**
 * @author chandra
 *
 */
public class Mgr7 
{
 public static void main(String[] args) {
	E e1=new E();
	e1.start();
	
	for(int i=30;i<=60;i++)
	{
		System.out.println(i);
	}
	
}
}
