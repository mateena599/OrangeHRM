package com.NewtourExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass 
{
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";


@BeforeTest
public void setUp()
{


System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");

driver = new ChromeDriver();

driver.get(url);
driver.manage().window().maximize();
}

/*@AfterTest
public void tearDown()
{
driver.quit(); // closes the Browser will the Tab's in it
}*/

}
