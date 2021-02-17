package oops;

class A
{
	int a;
	double d;
	char c;
	void test()
	{
		System.out.println("from A class test");
	}
}
class B extends A
{
	String s;
	void test()
	{
		System.out.println("from B class test");
	}
}

/**
 * @author chandra
 *
 */
public class Inheritance 
{
   public static void main(String[] args) {
	A a1=new A();
	a1.a=12;
	a1.d=23.21;
	a1.c='f';
	B b1=new B();
	b1.a=112;
	b1.d=120.21;
	b1.c='g';
	b1.s="abc";
	System.out.println("done");
}
}
