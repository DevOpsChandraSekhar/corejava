package basics;

import java.util.Scanner;

/**
 * @author chandra
 *
 */
public class Cmdline
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter String value");
		  String s1=sc.next();
		  System.out.println("enter integer value");
		  int i=sc.nextInt();
		  System.out.println("enter double value");
		  Double d=sc.nextDouble();
		  System.out.println("enter boolean value");
		  boolean b=sc.nextBoolean();
		  System.out.println("You  have entered");
		  System.out.println("==============");
		  System.out.println(s1);
		  System.out.println(i);
		  System.out.println(d);
		  System.out.println(b);
	}
  
}
