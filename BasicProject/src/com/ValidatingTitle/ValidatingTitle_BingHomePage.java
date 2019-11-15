package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.bing.com");
		
		String Expected_result_Bing_HomePageTitle="Bing";
		System.out.println("The Expected Title of the Bing Homepage is:"+Expected_result_Bing_HomePageTitle);
		
		String Actual_Result_Bing_HomePageTitle=driver.getTitle();
		System.out.println("The Actual Title of the Bing Homepage is:"+Actual_Result_Bing_HomePageTitle);
		
		if(Actual_Result_Bing_HomePageTitle.contentEquals(Expected_result_Bing_HomePageTitle))
		{
			System.out.println("Title Matched- pass");
		}
		else
		{
			System.out.println("Title is not Matched- Failed");

		}
		
           driver.close();
	}

}
