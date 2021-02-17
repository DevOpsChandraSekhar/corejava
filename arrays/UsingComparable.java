package arrays;

import java.util.Arrays;

/**
 * @author chandra
 *
 */
class D implements Comparable<Object>
{
  int i;
  D(int i)
  {
	  this.i=i;
  }
  @Override
	public String toString() {
		return "i=:"+i;
	}
	@Override
	public int compareTo(Object obj) {
		D d1=(D)obj;
		return i-d1.i;
	}
	
}
public class UsingComparable
{
	public static void main(String[] args) {
		D[] x={
				   new D(10),new D(40),new D(23),new D(11)
		   };
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
   
  
}
