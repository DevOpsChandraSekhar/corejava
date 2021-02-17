package basics;

/**
 * @author chandra
 *
 */
public class StaticTest 
{
   static int i;
   static int j=10;
   static 
   {
	   System.out.println("Sib");
   }
   static void test()
   {
	   System.out.println("From test");
   }
   public static void main(String[] args) {
	System.out.println("begin main");
	test();
	System.out.println("end main");
}
}
