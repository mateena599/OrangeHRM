package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathMultiplePropertis {

	public static void main(String[] args) 
	{

		WebDriver driver=null; 
		String url="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
         driver.manage().window().maximize();
       //<input type="email" class="inputtext login_form_input_box" name="email"
         //id="email" data-testid="royal_email">
         //          //*[@id="email"]
         
         WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]")); 
          
	     email.sendKeys("dreamsma3@yahoo.com");
	     //      //*[@id="pass"]
	     //
         
          //<input type="password" class="inputtext login_form_input_box" 
	     //name="pass" id="pass" data-testid="royal_pass">
	     
	     WebElement password =driver.findElement(By.xpath("//input[@type='password' and @class='inputtext login_form_input_box' ]"));
	     password.sendKeys("tzarinaa");

	     //<input value="Log In" aria-label="Log In" data-testid="royal_login_button"
	     //type="submit" id="u_0_4">
	     ////*[@id="u_0_4"]
	     //#u_0_4
	     
//	     WebElement Login=driver.findElement(By.xpath("//*[@id='u_0_4']"));
//	     Login.click();
	     
	     Actions action=new Actions(driver);
	     
	     action.sendKeys(Keys.TAB).perform();
	     action.sendKeys(Keys.ENTER).perform();
	     
	     
	     
	     driver.quit();
	     
	   }
	}
