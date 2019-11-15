package com.Inheritance;
public class Test3 extends Test2
{

	public void Method4()
	{
	System.out.println("Method 4 Executed successfully");
	}
	
	
	public static void main(String[] args) 
	{
      Test3 t3=new Test3();
      t3.Method1();
      t3.Method4();
      //t3.Method3();																					
      
	}

}
