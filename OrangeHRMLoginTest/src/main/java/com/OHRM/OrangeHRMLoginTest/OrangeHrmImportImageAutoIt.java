package com.OHRM.OrangeHRMLoginTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrmImportImageAutoIt 
{
Logger log=Logger.getLogger("OrangeHrmImportImageAutoIt");
WebDriver driver=null;
String url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";

   @BeforeTest
   public void SetUp()
   {
	PropertyConfigurator.configure("Log4j.properties");
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	log.info("Chrome Browser Opened successfully");
	driver.get(url);
	log.info("OrangeHRM application opened successfully");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

   @Test(priority=1)
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
   
   @Test(priority=2)
   public void PIM()
   {
//<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" 
//class="firstLevelMenu"><b>PIM</b></a>
	   WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
	   Actions action=new Actions(driver);
	   action.moveToElement(pim);
	   log.info("Pim Element Mouse Over action successfull");

	   
   }
   @Test(priority=3)
   public void AddEmployee()
   {
	 //<a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	   WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
	   addEmployee.click();
	   log.info("Click on AddEmployee sucessfull");
   }
   @Test(priority=4)
   public void UploadImage()
   {
	   //<input class="duplexBox" type="file" name="photofile" id="photofile">
	   WebElement choosefile=driver.findElement(By.id("photofile"));
	   choosefile.click();
	   log.info("Click operation on choose File successfull");
   }
   @Test(priority=5)
   public void FirstName()
   {
	  //<input class="formInputText" maxlength="30" 
	   //type="text" name="firstName" value="zubair" id="firstName">
	   WebElement firstName=driver.findElement(By.id("firstName"));
	   firstName.sendKeys("Zubair");
	   log.info("Firstname Entered successfully");
   }
   @Test(priority=6)
   public void MiddleName()
   {
	   
   }
 
   
   @Test(priority=7)
   public void SaveBtn()
   {
	   //<input type="button" class="" id="btnSave" value="Save">
	   WebElement saveButton=driver.findElement(By.id("btnSave"));
	   saveButton.click();
	   log.info("Click Operation save Button is Successful");
   }
}
