package com.Google;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_Click 
{

	public static void main(String[] args)
	{
		
		//WebElement driver=null;
		String url="http://www.google.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		
		/* <a class="gb_e" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi&amp;ogbl">Images</a> */
		
		driver.findElement(By.linkText("Images")).click();
		String ImagesTitle=driver.getTitle();
		System.out.println("The title of the Google image page is------>"+ImagesTitle);
		driver.quit();
		
	
	}

}
