package basics;

/**
 * @author chandra
 *
 */
public class HelloWorld 
{
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	public HelloWorld() 
	{ 
		System.out.println("HelloWorld()");
	}
	static final public  void main(String[] args)
	{
		  System.out.println("Main");
		HelloWorld hw1=new HelloWorld();
		System.out.println("=============");
		HelloWorld hw2=new HelloWorld();
     
	}

}
