package com.BasicJava;

public class SwitchCase {

	public static void main(String[] args)
	{
		int WeeekNumber=6;
		switch(WeeekNumber)
		{
		case 1: System.out.println("MOnday");
		         break;
		case 2: System.out.println("Tuesday");
                 break;
        case 3: System.out.println("Wednesday");
                   break;
        case 4: System.out.println("Thursday");
        		   break;
        case 5: System.out.println("friday");
                   break;
        case 6: System.out.println("saturday");
                   break;
        case 7: System.out.println("sunday");
                  break;
                  
                  default: System.out.println("Weeknumber is not available");
                                break;
		}

	}

}
