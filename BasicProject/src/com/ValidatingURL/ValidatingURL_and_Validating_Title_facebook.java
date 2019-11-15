package com.ValidatingURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingURL_and_Validating_Title_facebook {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		
		String Actual_facebookPage=driver.getCurrentUrl();
		System.out.println("The actual URL address ofthe facebook is"  +Actual_facebookPage);
		
		String Expected_FacebookPage="facebook.com";
		System.out.println("The actual URL address ofthe facebook is"  +Expected_FacebookPage);
		
		
		if(Actual_facebookPage.contains(Expected_FacebookPage))
		
			{
				System.out.println("URL existing- pass");
			}
			else
			{
				System.out.println("URL not Existing- Failed");

			}
			

		String Actual_facebook_LoginPage_Title=driver.getTitle();
		
		System.out.println("The actual URL address ofthe facebook is"  +Actual_facebook_LoginPage_Title);

		
		
           String Expected_facebook_LoginPage_Title="Facebook-login or signUp";
		
		System.out.println("The Expected URL address ofthe facebook is"  +Expected_facebook_LoginPage_Title);

		
		if(Actual_facebook_LoginPage_Title.equals(Expected_facebook_LoginPage_Title))
		{
			
			System.out.println("Title Matched -pass");
		}
		else
		{
			System.out.println("Title Not matched- Failed");

		}
		
              driver.close();
		}
		
	}


