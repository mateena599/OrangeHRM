package com.BasicJava;

public class MethodExample2 {
	
	
	//global variable
	int a=40,b=20;
	public void add()
	{
		int a=30,b=20;
		int c=a+b;
		System.out.println("addition of two numbers is    :"+c);
		
	}
	public void subs()
	{
		//local variable
		int a=30,b=20;
		int c=a-b;
		System.out.println("Substraction of two numbers is:"+c);
	}
	

	public static void main(String[] args)
	{
		MethodExample2 m=new MethodExample2();
		System.out.println("Methods Example outside declaration of variables will be accessed BY THE METHODS ");
		System.out.println("------------------------------------------------------------------");
	   m.add();
	   m.subs();
	   m.divs();
	}
	public void divs()
	{
		
		int c=a/b;
		System.out.println("Division of two numbers is    :"+c);
	}

}
