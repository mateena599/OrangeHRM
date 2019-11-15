/*package com.BasicJava;

public class WhileLoopExample {

	public static void main(String[] args)
	{
	     int i=2;
	     while(i<=4)
	     {
	    	 System.out.println(i+ "  "+"Testing");
	    	 i++;
	     }
	     
	     System.out.println(); 
	     System.out.println();
	     
	     System.out.println("########## Decrement##############");
	     
	     int a=5;
	     while(a>=4)
	     {
	    	 System.out.println(a+ "  "+"Testing");
	    	 a--;
	     }
	     
	     
	     

	}

}
*/






package com.BasicJava;

//import com.Inheritance.Employee;
//import com.Inheritance.Programmer;

class Employee
    {
    	
    	float salary=100000;
    
    }
    class Programmer extends Employee
    {
    	int bonus=200000;
    	
    	
    	
    	public static void main(String[] args)
    	{
                  Programmer p=new Programmer();
                  System.out.println("Programmer Salary is:"+p.salary);
                  System.out.println("Bonus of Programmer is:"+p.bonus);
    	}

    }
