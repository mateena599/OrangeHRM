package com.LinksTesting;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTestingAndAutomatingEachLink {

	public static void main(String[] args) 
	{
		WebDriver driver=null; 
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);

		
		List <WebElement>NewToursPageLinks=driver.findElements(By.tagName("a"));
		int LinksCount=NewToursPageLinks.size();
		System.out.println("The totalnumber of links are:"+LinksCount);
		
		
		for(int i=0;i<LinksCount;i++)
		{
			   //Getting Link name
	            String LinkName=NewToursPageLinks.get(i).getText();
	            System.out.println(i+"------"+LinkName);
	            // Getting Title And CurrentPage URL
	            NewToursPageLinks.get(i).click();
	            System.out.println(driver.getTitle());
	            System.out.println(driver.getCurrentUrl());
	            System.out.println();
	            
	            driver.navigate().back();
	            NewToursPageLinks=driver.findElements(By.tagName("a"));
	            
		}
		
	}

}
