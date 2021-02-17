package exceptionhanding;

/**
 * @author chandra
 *
 */
public class O 
{
  public static void main(String[] args) 
{
	  System.out.println(1);
	int i=10/0;
	try
	{
		System.out.println(1);
	}catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	System.out.println(2);
}
}
