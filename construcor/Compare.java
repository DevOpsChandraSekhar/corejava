package construcor;

/**
 * @author chandra
 *
 */
public class Compare
{
  Compare()
  {
	  System.out.println("int()");
  }
 Compare(char c) 
{
	 this();
	System.out.println("byte()");
}
 public static void main(String[] args) {
	Compare c=new Compare('d');
	
}
}
