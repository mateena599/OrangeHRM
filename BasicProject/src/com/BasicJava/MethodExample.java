package com.BasicJava;

public class MethodExample 
{
	public void Test1()
	{
		System.out.println(" Method 1 executed succesfully");
	}
	public void Test2()
	{
		System.out.println(" Method 2 executed succesfully");
	}

	public static void main(String[] args) 
	{
		
		MethodExample m= new MethodExample();
		System.out.println(" Methods Example :");
		System.out.println(" --------------------");
	
		m.Test1();
		m.Test2();
		m.Test3();
	}
	public void Test3()
	{
		System.out.println(" Method 3 executed succesfully");
	}
	

}
