package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
        String url="https://opensource-demo.orangehrmlive.com";
        System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
        driver= new FirefoxDriver();
      driver.get(url);
      
      //<input name="txtUsername" id="txtUsername" type="text">
      //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
      //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
      driver.findElement(By.id("txtUsername")).sendKeys("admin");
      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
      WebElement OrangeBttonClick=driver.findElement(By.id("btnLogin")); 
      OrangeBttonClick.click();
      
   
      
       
	}

}
