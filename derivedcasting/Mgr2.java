package derivedcasting;

/**
 * @author chandra
 *
 */
public class Mgr2 {

	public static void main(String[] args) 
	{
      A a1=new B();
      B b1=new D();
      C c1=new E();
      D d1=new F();
      
      A a2=new C();
      B b2=(B)a2;
	}

}
