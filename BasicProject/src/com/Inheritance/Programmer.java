package com.Inheritance;

public class Programmer extends Employee


{
	float bonus=100000;
	float c= salary+bonus;

	public static void main(String[] args)
	{
       Programmer p=new Programmer();
       System.out.println("#######&&&&& INFORMATION OF AN EMPLOYEE &&&&######");

       System.out.println(" ");
       
       System.out.println(" Programmer salary is--------> :"+p.salary);
       System.out.println(" Bonus of Programmer is------> :"+p.bonus);
       System.out.println(" Addition of salary + bonus--> :"+p.c);


	}

}
