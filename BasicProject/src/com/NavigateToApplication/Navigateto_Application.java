package com.NavigateToApplication;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigateto_Application {

	public static void main(String[] args) 
	{
		
		//Automate Firefox Browser
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		FirefoxDriver firefox= new FirefoxDriver();
		firefox.get("http://www.bing.com");
		//firefox.get("http://www.facebook.com");
		//firefox.navigate().to("http://www.google.com");
		firefox.close();
	}

}
