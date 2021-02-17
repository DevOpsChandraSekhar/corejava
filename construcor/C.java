package construcor;

/**
 * @author chandra
 *
 */
public class C 
{
	int i;
	int j=10;
	C()
	{
		i=20;
	}
  public static void main(String[] args) 
  {
	C c1=new C();
	System.out.println(c1.i);
	System.out.println(c1.j);
  }
}
