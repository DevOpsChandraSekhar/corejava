package oops;

class C{
	static void test1()
	{
		System.out.println("C-test1");
	}
}
class D extends C
{
	static void test1()
	{
		System.out.println("D-test1");
	}
}
/**
 * @author chandra
 *
 */
public class Polymorphism 
{
  static void method(C c1)
  {
	  c1.test1();
  }
  public static void main(String[] args) {
	C obj=new C();
	D obj1=new D();
	method(obj);
	method(obj1);
}
}
