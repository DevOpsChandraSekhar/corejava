package com;


/**
 * @author chandra
 *
 */
public class Split 
{
 public static void main(String[] args) {
	
	 String str="this is splitting diff tokens";
	 String[] tokens=str.split(" ");
	for(String s:tokens)
	{
		System.out.println(s);
	}
			 
}
}
