package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_Test {

	public static void main(String[] args)
	{
		
		
		String url="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		
		/*
		 
		 inspect facebook username text field
		 property of 1. username 2. passworrd  3. Login Button
		 
		 <input id="email" data-text id="royal-email"
		 
		 locator=id
		 selector=email
		 
		 */
		
		driver.findElement(By.id("email")).sendKeys("dreamsma3 @yahoo.com");
		
	// <input id="pass" data-testid="royal-pass">
		
		driver.findElement(By.id("pass")).sendKeys("hello");
		
		//<label id="Loginbutton"> </label>
		
		
		driver.findElement(By.id("Loginbutton")).click();

	}

}
