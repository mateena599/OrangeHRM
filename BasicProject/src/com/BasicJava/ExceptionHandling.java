package com.BasicJava;

public class ExceptionHandling {

	public static void main(String[] args)
	{
		try
		{
			float a=25,b=0;		
            float c=a/b;
             System.out.println(c);
	     }
		catch(Exception holdException)
		{
			System.out.println("The operation cannot be performed");
			System.out.println(holdException);
		}
	}

}
