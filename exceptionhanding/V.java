package exceptionhanding;

/**
 * @author chandra
 *
 */
public class V
{
 public static void main(String[] args) {
	System.out.println(11);
	//int i=10/0;
	 try
	{
		System.out.println(1);
		return;
		
	}catch(ArithmeticException e)
	{
		System.out.println(2);
	}
	finally {
		System.out.println(3);
	}
	System.out.println(4);
}
}
