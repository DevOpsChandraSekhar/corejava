package construcor;

/**
 * @author chandra
 *
 */
public class T 
{
 T()
 {
	 
	 System.out.println("T()");
 }
 {
	 System.out.println("IIB");
 }
 T(int i)
 {
	 
	 System.out.println("T(int)");
 }
 public static void main(String[] args) {
	T t1=new T();
	T t2=new T(20);
	
}
}
