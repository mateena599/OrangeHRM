package com.BasicJava;

public class ObjectArray {

	public static void main(String[] args) {

		
		Object array1[]=new Object[4];
		array1[0]=10;
		array1[1]="Selenium";
		array1[2]=10.25;
		array1[3]='a';
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(i+"  " +array1[i]);
		}

	}

}
