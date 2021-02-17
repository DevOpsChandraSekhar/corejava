package basics;

/**
 * @author chandra
 *
 */
public class Conversion 
{
 public static void main(String[] args) {
	double d=20.45;
	int i=(int)d;
	System.out.println(d);
	System.out.println(i);
	System.out.println("==========");
	String s="123";
	Integer ii=Integer.valueOf(s);
	System.out.println(s);
	System.out.println(ii);
	double d1=23.43;
	int iii=(short)(byte)(int)(long)d1;
	System.out.println(iii);
	
}
}
