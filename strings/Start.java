package com;


/**
 * @author chandra
 *
 */
public class Start 
{
 public static void main(String[] args) {
	
	 String str="this is starts ";
	 if(str.startsWith("this"))
	 {
		 System.out.println("true");
	 }
	 else
	 {
		 System.out.println("false");
	 }
	 if(str.startsWith("is",5))
	 {
		 System.out.println("true");
	 }
	 else
	 {
		 System.out.println("false");
	 }
}
}
