package com.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Newtours_RegisterLink {

	public static void main(String[] args)
	{
		WebDriver driver=null; 
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//<a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		String registerElement_text=register.getText();
		System.out.println("The text of Register element is--->:"+registerElement_text);
		
		String expected_registerUrlAddress=register.getAttribute("href");
		System.out.println("The expected Url Address of Register Element is--> :"+expected_registerUrlAddress);
		
		register.click();
		String actual_UrlAddress=driver.getCurrentUrl();
		System.out.println("The actual Url Adrress of register Element is-->"+actual_UrlAddress);
		
		if(actual_UrlAddress.equals(expected_registerUrlAddress))
		{
			System.out.println("Both the URL is matched----Passed");
		}
		else
		{
			System.out.println("Both The URL is not matched----failed");
		}
		
		driver.quit();
	}

}
