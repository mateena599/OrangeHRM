package com.BasicJava;

public class ArrayExample {

	public static void main(String[] args) {
          int array1[]=new int[3];
	
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;

         /*for(int i=0;i<array1.length;i++)
         {
        	 System.out.println(i+"   " +array1[i]);
         }*/
		
		/*
		int i=0;
		while(i<=2)
		{
			System.out.println(i+ "  " +array1[i]);
			i++;
		}*/
		
		
		
		int i=0;
		do
		{
			System.out.println(i+ "  " +array1[i]);
			i++;
			
		}while(i<=2);
		
		
		
		
		
		
		
		
	}

}
