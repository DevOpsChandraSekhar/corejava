package threads;
class G extends Thread
{
	public void run() 
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println(i);
		}
	}
	void startThread()
	{
		start();
	}
}

/**
 * @author chandra
 *
 */
public class Mgr9 {
public static void main(String[] args) {
	G g1=new G();
	g1.startThread();
	for(int i=30;i<=50;i++)
	{
		System.out.println(i);
	}
}
}
