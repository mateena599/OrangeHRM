package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_loginPage_LinksCount {

	public static void main(String[] args) 
	{

		//webdriver -  is an interface in selenium
		
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		/* finding links in newtours.demoaut.com  */
		
		List <WebElement>NewtoursLoginPageLinks=driver.findElements(By.tagName("a"));
		int LinksCount=NewtoursLoginPageLinks.size();
		System.out.println("Total number of links in Newtor Page::--->"+LinksCount);
		
		for(int i=0;i<LinksCount;i++)
		{
			String Linkname=NewtoursLoginPageLinks.get(i).getText();
			
			System.out.println(i+ " - "+Linkname);
		}
		driver.quit();
		
	}

}
