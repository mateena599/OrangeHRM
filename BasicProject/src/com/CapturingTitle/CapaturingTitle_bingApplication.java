package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapaturingTitle_bingApplication {

	public static void main(String[] args) 
	
	{
		//String url="http://www.bing.com";
       System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://www.bing.com");
       //driver.get(url);
       String title=driver.getTitle();
		
		System.out.println("The title of the Bing home page is:"  +title);
	}

}
