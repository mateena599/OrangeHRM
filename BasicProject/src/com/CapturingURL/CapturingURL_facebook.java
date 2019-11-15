package com.CapturingURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingURL_facebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		String Actual_facebookPage=driver.getCurrentUrl();
		
		System.out.println("The actual URL address ofthe facebook is"  +Actual_facebookPage);
		driver.close();
		
	}

}
