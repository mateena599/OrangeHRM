package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookKeyboardOperation {

	public static void main(String[] args)
	{
            WebDriver driver=null;
            String url="http://facebook.com";
            System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
            driver=new ChromeDriver();
            driver.get(url);
            //<input type="email" class="inputtext login_form_input_box" name="email"
            //id="email" data-testid="royal_email">
            WebElement email=driver.findElement(By.id("email"));
             email.sendKeys("dreamsma3@yahoo.com");
             
             Actions action= new Actions(driver);
             action.sendKeys(Keys.TAB).perform();
            action.sendKeys("password").perform();
            action.sendKeys(Keys.ENTER).perform();
	}

}
