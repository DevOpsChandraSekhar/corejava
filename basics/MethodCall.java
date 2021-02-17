package basics;

/**
 * @author chandra
 *
 */
public class MethodCall 
{ 
  static void test1()
  {
	  System.out.println("test1");
  }
	public static void main(String[] args)
	{
		System.out.println("main");
		test2();
		test1();
		test2();
	}
	static void test2()
	  {
		  System.out.println("test2");
	  }
}
