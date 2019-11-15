package com.ScreenShot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursScreenLinks {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null; 
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
         driver.manage().window().maximize();
		
		List <WebElement>NewToursPageLinks=driver.findElements(By.tagName("a"));
		int LinksCount=NewToursPageLinks.size();
		System.out.println("The totalnumber of links are:"+LinksCount);
		
		
		for(int i=0;i<LinksCount;i++)
		{
			   //Getting Link name
	            String LinkName=NewToursPageLinks.get(i).getText();
	            System.out.println(i+"------"+LinkName);
	            // clicking on The LINK
	            
	            NewToursPageLinks.get(i).click();

	            
	            File newtourslinks_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          		FileUtils.copyFile(newtourslinks_Screenshot,new File("./Screenshots/"+LinkName+".png"));
          
          		
          		
          		driver.navigate().back();
     	        NewToursPageLinks=driver.findElements(By.tagName("a"));
     	            
     	        
     	        
     	  
     	        
          		          		
          	/*	
	    	TakesScreenshot screenshot=(TakesScreenshot)driver;
	    	File file=screenshot.getScreenshotAs(OutputType.FILE);
	    	String f=file.getName();
	    	System.out.println("The name of the screenshot is--->:"+f);
	    	FileUtils.copyFile(file, new File("./Screenshots/"+LinkName+".png"));
	    	*/
	       

	}

}}
