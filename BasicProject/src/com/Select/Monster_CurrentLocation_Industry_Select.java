package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args)
	{
		WebDriver driver=null; 
		String url="https://my.monsterindia.com/sponsered_popup.html";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
         driver.manage().window().maximize();
         
        //<select class="border_grey1"
         
         WebElement currentlocation=driver.findElement(By.className("border_grey1"));
         
         Select selection=new Select(currentlocation);
         selection.selectByIndex(2);
         //name="industry"
         WebElement industry=driver.findElement(By.name("industry"));
         Select sel_IndustryOption=new Select(industry);
         sel_IndustryOption.selectByIndex(1);
         sel_IndustryOption.selectByValue("34");
         sel_IndustryOption.selectByVisibleText("Government/PSU/Defence");
         
         //Deselection of the optionalvaues fromthe industry dropdown
         
         sel_IndustryOption.deselectByValue("22");
         sel_IndustryOption.deselectByValue("65");
         
         
         // de selecting all the optional values selected
         
         sel_IndustryOption.deselectAll();
	}

}
