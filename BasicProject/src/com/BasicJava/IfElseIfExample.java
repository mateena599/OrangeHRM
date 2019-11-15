package com.BasicJava;

public class IfElseIfExample {

	public static void main(String[] args)
	{
	
		int a=50;
		int b=50;
		int c=80;
		  
		 if(a>b && a>c)
		 {
			  System.out.println("a is greater");
			 
		 }
		 		else if(b>c)
		 		{
		 			System.out.println("b is greater");
		 		}
		   
		   
		 		else if(a==b)
		 		{
		 			System.out.println("a is equal to b");
		 		}
		    	
		else
		 {
		      System.out.println(" c is greater");
		 }
		     
	}

}
