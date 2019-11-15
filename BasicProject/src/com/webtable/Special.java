package com.webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Special {

	public static void main(String[] args) 
	{
			WebDriver driver = null;
		String url="http://newtours.demoaut.com";

		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	    driver = new ChromeDriver();
         driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/font
//		/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/div/font/b
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/font
		
		
		//              /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td
	
		
		String part1="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=2;j++)
			{
				
			WebElement specialElement=driver.findElement(By.xpath(part1+i+part2+j+part3));
			String specialElementText=specialElement.getText();
			System.out.print(specialElementText+"   ");
			}
			
			System.out.println();
			
		}
	}

}
