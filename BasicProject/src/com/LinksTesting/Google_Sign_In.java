package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Sign_In {

	public static void main(String[] args)
	{
       String url="http://www.google.com";
       System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get(url);
       
       /*
        <a class="gb_de gb_1 gb_pb" id="gb_70" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.co.in/imghp%3Fhl%3Den%26tab%3Dri%26ogbl" target="_top">Sign in</a>
        */
          // driver.findElement(By.id("gb_70")).click();
      WebElement signin =driver.findElement(By.id("gb_70"));
      
      signin.click();
      
      /* 
       <input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" 
       autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" 
       name="identifier" value="" autocapitalize="none" 
       id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
       */
       WebElement emailid=  driver.findElement(By.id("identifierId"));
      emailid.sendKeys("mateenahmed599@gmail.com");
         
         
         
         /*
         
          */
         /*
         id="identifierNext"
          */
       WebElement Next=  driver.findElement(By.id("identifierNext"));
         Next.click();
         /*
          id=password
          
          <input type="password" class="whsOnd zHQkBf" jsname="YPqjbf" 
          
          autocomplete="current-password" spellcheck="false" 
          tabindex="0" aria-label="Enter your password" name="password"
           autocapitalize="off"
           dir="ltr" data-initial-dir="ltr" data-initial-value="">
          
           
          */
       // driver.findElement(By.name("password")).sendKeys("hello");
    //   EnterPassword.sendKeys("tzarinaa599$");
         /*
          id=passwordNext
          */
       //driver.findElement(By.id("passwordNext")).click();
   
	}
}