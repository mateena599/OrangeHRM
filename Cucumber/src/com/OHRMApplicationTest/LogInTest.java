package com.OHRMApplicationTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest 
{
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	@Given("^open chrome browser and navigate to OrangeHRM Application$")
	public void open_chrome_browser_and_navigate_to_OrangeHRM_Application()  
	{
	    System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and click on logIn button$")
	public void User_enters_and_and_click_on_logIn_button(String UserName, String Password) 
	{
		 //<input name="txtUsername" id="txtUsername" type="text">
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.clear();
		userName.sendKeys(UserName);
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.clear();
		password.sendKeys(Password);
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement logIn=driver.findElement(By.id("btnLogin"));
		logIn.click();
	}
	
	
	
	

	/*@When("^User enters UserName and Password and click on logIn button$")
	public void User_enters_UserName_and_Password_and_click_on_logIn_button()  
	{
	    //<input name="txtUsername" id="txtUsername" type="text">
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.clear();
		userName.sendKeys("admin");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.clear();
		password.sendKeys("admin");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement logIn=driver.findElement(By.id("btnLogin"));
		logIn.click();
			}*/

	@Then("^User should be able to login successfully to the application and close the browser$")
	public void User_should_be_able_to_login_successfully_to_the_application_and_close_the_browser() throws IOException
	{
	    try
	    {
	    	String expected_text="Welcome Admin";
	    	System.out.println("The expected text is:"+expected_text);
	    	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	    	String actual_text=driver.findElement(By.id("welcome")).getText();
	    	System.out.println("The actual text is: "+actual_text);
	    	if(actual_text.contains(expected_text))
	    	{
	    		System.out.println("Successfully LogIn-PASS"); 

	    	}
	    }
	        catch (Exception e) 
	        {
				//<span id="spanMessage">Invalid credentials</span>
	        	if(driver.findElement(By.id("spanMessage")).getText().contains("Invalid credentials"))
	        	{
	        		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        		FileUtils.copyFile(screenshot,new File("./ScreenShots/LogInpage.png"));
	        		System.out.println("LogIn Failed-FAILED");
	        		driver.quit();
	        	}
			}
	    
	    
		
	    driver.quit();
	}
	
}
