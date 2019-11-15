package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Vacations_BackToHome_ElementAutomation {

	public static void main(String[] args)
	{
		WebDriver driver=null; 
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
         driver.manage().window().maximize();
		  //vacations
         //<a href="mercuryunderconst.php">Vacations</a>
         
         WebElement vacations=driver.findElement(By.linkText("Vacations"));
         vacations.click();
         
         //BackToHome
         //<img src="/images/forms/home.gif" width="118" height="23" border="0">
         
         //Relative xpath
         //Syntax of Xpath Expression
         //   //tagname[@attribute='value']  or  //*[@attribute='value']
         
         //syntax of xpath expression creation for automating "BackToHome" Element
         //   //img[@src='/images/forms/home.gif']
         
         //     //*[@src='/images/forms/home.gif']
         
         //WebElement backToHome=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
                                      //OR
        // WebElement backToHome=driver.findElement(By.xpath("//*[@src='/images/forms/home.gif']"));
         
         
         
         //Absolute xpath----Html Tag
         //It is created based onthe Html Tags of the Inspected Element Following the Html Tag right from the top of the Html source code till the inspected Element Tag
         ///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
         
         WebElement backToHome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));
         backToHome.click();
         
	}

}
