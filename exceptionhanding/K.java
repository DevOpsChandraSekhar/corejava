package exceptionhanding;

/**
 * @author chandra
 *
 */
public class K 
{ 
	public static void main(String[] args) {
		System.out.println(1);
		try
		{
			System.out.println(2);
			int i=10/0;

		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}
