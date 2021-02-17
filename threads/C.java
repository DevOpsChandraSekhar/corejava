package threads;

/**
 * @author chandra
 *
 */
public class C  implements Runnable
{

	public void run() {
		for(int i=0;i<=50;i++)		
		{
			System.out.println(i);
		}
	}
  public static void main(String[] args) {
	C c1=new C();
	Thread t1=new Thread(c1);
	t1.start();
	
}
}
