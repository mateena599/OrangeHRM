package com.Newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Testing {

	public static void main(String[] args) {

		
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.name("userName")).sendKeys("mateenahmed599");
		driver.findElement(By.name("password")).sendKeys("tzarinaa");
		driver.findElement(By.name("login")).click();
		
		
		String Expected_HomePage="Find";
		System.out.println("The Expected :"+Expected_HomePage);
		String Actual_HomePage=driver.getTitle();
		System.out.println("The Actual:"+Actual_HomePage);
		
		if(Actual_HomePage.contains(Expected_HomePage))
		{
			System.out.println("Login Succesful-Pass");
		}
		else
		{
			System.out.println("Login failed-Failed");
		}
		driver.quit();
	}

}
