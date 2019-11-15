 package com.OHRM.OrangeHRMLoginTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LoginTest 
{
	 //Logger class is used to maintain the result related to the class-"ohrm_logIntest"
	
	Logger log=Logger.getLogger("OHRM_LoginTest");
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	@BeforeTest
	public void SetUp()
	{
		// providing the information related tothe log4j.properties file in which
		//the path of the folder location of the project is setup with certain log file 
		//which should get created and update with the results
		
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver= new ChromeDriver();
		
		//using the logger class object created-with the method "info"
		//exporting the result to the log files
		
		log.info("Chrome Browser Succesfully opened");
		driver.get(url);
		log.info("OrangeHRM application Opened Successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void LogIn()
	{
		//<input name="txtUsername" id="txtUsername" type="text">
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		log.info("UserName Entered successfully");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		log.info("Password Entered successfully");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement logIn=driver.findElement(By.id("btnLogin"));
		logIn.click();
		log.info("Click Operation on LogIn Button successfully");
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		String Expected_Text="Welcome Admin";
		log.info("The expected Text is: "+Expected_Text);
		
		String Actual_text=driver.findElement(By.id("welcome")).getText();
		log.info("The Actual Text is: "+Actual_text);
		
		if(Actual_text.equals(Expected_Text))
		{
			log.info("Login successfull-PASS");
		}
		else
		{
			log.info("Login failed-FAIL");
		}
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		log.info("Application closed successfully");
	}
	
}