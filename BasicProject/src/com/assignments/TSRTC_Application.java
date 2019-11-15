package com.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Application {

	public static void main(String[] args)
	{
		WebDriver driver=null; 
		//String url="https://www.tsrtconline.in";
		String url="https://www.online.citibank.co.in/?eOfferCode=INHOGNTTNHOME";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

        /* ///html/body/div[3]/div

         ///html/body/div[3]
		
		WebElement menu=driver.findElement(By.xpath("/html/body/div[3]/div"));
		String Headernames=menu.getText();
		System.out.println("The Names  of the TSTRC HomePage Menu Header Links are");
		System.out.println(Headernames);
	
				 driver.quit();*/
		
		////*[@id="nav"]

		WebElement menu=driver.findElement(By.xpath("//*[@id='nav']"));
		String Headernames=menu.getText();
		System.out.println("The Names  of the citibank HomePage Menu Header Links are");
		System.out.println(Headernames);
		driver.quit();
		
		
		//<a href="javascript:;" class="visible-dektop overlay-login" title="Login"><span class="lockSign"><img width="1" 
		//height="1" border="0" alt="" src="/images/spacer.gif"></span><span class="txtSign">Login</span></a>
		
		WebElement logIn=driver.findElement(By.linkText("Login"));
		
	}

}
