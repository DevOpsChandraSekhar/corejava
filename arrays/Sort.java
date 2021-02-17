package arrays;

import java.util.Arrays;

/**
 * @author chandra
 *
 */
public class Sort 
{
	public static void main(String[] args) {
		int x[]={10,20,30,40,4,5};
		  System.out.println(x);
		  System.out.println(Arrays.toString(x));
		  Arrays.sort(x);
		  System.out.println(Arrays.toString(x));
		  int i=Arrays.binarySearch(x, 5);
		  System.out.println(i);
		  int i1=Arrays.binarySearch(x, 20);
		  System.out.println(i1);
	}
  
}
