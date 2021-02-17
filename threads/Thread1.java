package threads;

/**
 * @author chandra
 *
 */
public class Thread1 extends Thread
{
  @Override
public void run() {
	for(int i=0;i<=200;i++)
	{
		System.out.println(i);
	}
}
  public static void main(String[] args) {
	Thread1 t1=new Thread1();
	t1.start();
	System.out.println("in main ");
	for(int i=210;i<=300;i++)
	{
		
		System.out.println(i);
	}
}
}
