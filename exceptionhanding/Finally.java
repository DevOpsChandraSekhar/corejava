package exceptionhanding;

/**
 * @author chandra
 *
 */
public class Finally 
{
  public static void main(String[] args) {
	System.out.println(1);
	try
	{
		System.out.println(2);
		int i=10/0;
		System.out.println(3);
	}catch(ArithmeticException e)
	{
		System.out.println(4);
		int i=20/0;
		System.out.println(5);
	}
	finally {
		System.out.println(6);
	}
	System.out.println(7);
}
}
