package com.NewToursApplicationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Newtours_register {

	public static void main(String[] args)
	
	{
        
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//<input type="text" name="userName" size="10">
		//<input type="password" name="password" size="10">		
//			<input type="image" name="login" 	
			
		
		//<a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		//<input maxlength="60" name="firstName" size="20">
		//<input maxlength="60" name="firstName" size="20">
		//<input maxlength="20" name="phone" size="15">
		
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("Mohammed");
		//Tried in single line
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys("Ahmed").sendKeys(Keys.TAB).sendKeys("9963595736").sendKeys(Keys.TAB).sendKeys("mateenahmed599@gmail.com").sendKeys(Keys.TAB).sendKeys("mallapally").sendKeys(Keys.TAB).sendKeys("asif nagar").sendKeys(Keys.TAB).sendKeys("Hyderabad").sendKeys(Keys.TAB).sendKeys("Telangana").sendKeys(Keys.TAB).sendKeys("500001").perform();
		
		//<select name="country" size="1">
       // <option value="2">ALBANIA </option>

		WebElement country=driver.findElement(By.name("country"));
		Select selection=new Select(country);
		selection.selectByVisibleText("INDIA");
		
		action.sendKeys(Keys.TAB).sendKeys("mateen").sendKeys(Keys.TAB).sendKeys("tzarinaa").sendKeys(Keys.TAB).sendKeys("tzarinaa").perform();
		
		//<input type="image" name="register"
		//src="/images/forms/submit.gif" width="60" 
		//height="23" border="0">
		
		WebElement Submit=driver.findElement(By.name("register"));
		Submit.click();
		
		String expected_Titleof_register_Page="Register";
		System.out.println("The Expected title of Register Page is"+expected_Titleof_register_Page);

		
		String actual_Titleof_register_Page=driver.getTitle();
		System.out.println("The Actual title of Register Page is"+actual_Titleof_register_Page);
		
		
		if(actual_Titleof_register_Page.contains(expected_Titleof_register_Page))
		{
			System.out.println("Registration Successfull--PASSED");
		}
		else
		{
			System.out.println("Registration Unsuccessfull--FAILED");
		}
			
		
	}

}
