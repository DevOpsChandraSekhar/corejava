package strings;


/**
 * @author chandra
 *
 */
public class Compare {

	public static void main(String[] args) 
	{
     String s1="JUNK";
     String s2="junk";
     
     if(s1.equals(s2))
     {
    	 System.out.println("both are equal");
     }
     else
     {
    	 System.out.println("not equal");
     }
     if(s1.equalsIgnoreCase(s2))
     {
    	 System.out.println("both  r equal");
     }
     else
     {
    	 System.out.println("not equal");
     }
	}

}
