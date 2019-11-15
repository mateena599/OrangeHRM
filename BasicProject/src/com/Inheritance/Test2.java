package com.Inheritance;

public class Test2 extends Test1
{

	 private void Method3()
	{
	System.out.println("Method 3 Executed successfully");
	}
	
	public static void main(String []args)
	{
		Test2 t2=new Test2();
		t2.Method1();
		t2.Method3();
		
		//t2.Method2();
	}
	
}
