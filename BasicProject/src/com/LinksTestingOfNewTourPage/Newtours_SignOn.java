package com.LinksTestingOfNewTourPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_SignOn {

	public static void main(String[] args) 
	{
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		
		/* <a href="mercurysignon.php">SIGN-ON</a>*/
		driver.findElement(By.linkText("SIGN-ON")).click();
		String SignOnWebTitle=driver.getTitle();
		System.out.println("The title of the Sign-on page is :"+SignOnWebTitle);
	    driver.quit();
	}

}
