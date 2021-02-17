package wrapperclasses;

/**
 * @author chandra
 *
 */
public class WrapperToPrimitive 
{
  public static void main(String[] args) {
	Integer i=new Integer(99);
	int x=i.intValue();
	       System.out.println(x);
	byte b=i.byteValue();
	       System.out.println(b);
	short s=i.shortValue();
		   System.out.println(s);
		   
}
}
