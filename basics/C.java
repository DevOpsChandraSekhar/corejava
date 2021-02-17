package basics;

/**
 * @author chandra
 *
 */
public class C 
{
 int  i;
 static int j;
 static boolean b;
 
 public static void main(String[] args) {
	C c1=new C();
	c1.i=10;
	j=20;
	C c2=new C();
	c2.i=24;
	j=40;
	System.out.println(c1.i);
	System.out.println(c2.i);
	System.out.println(j);
	System.out.println(b);
}
}
