package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_EmployeeList_Alter {

	public static void main(String[] args) 
	{

		
		//*[@id="search-results"]/div
		//*[@id="search-results"]/div
		
		WebDriver driver=null; 
		String url="https://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		WebElement  UserName=driver.findElement(By.id("txtUsername"));
		UserName.sendKeys("admin");
		WebElement  password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement logIn=driver.findElement(By.id("btnLogin")); 
		logIn.click();
		
		//PIM element action
				WebElement  pim=driver.findElement(By.id("menu_pim_viewPimModule"));
				Actions action=new Actions(driver);
				action.moveToElement(pim).perform();

				//<a href="/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>

				WebElement EmployeeList=driver.findElement(By.id("menu_pim_viewEmployeeList"));
				EmployeeList.click();
		
		WebElement webtable=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div"));
		
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		int rowsCount=rows.size();
		for(int i=0;i<rowsCount;i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			int colsCount=cols.size();
			for(int j=0;j<colsCount;j++)
			{
				String data=cols.get(j).getText();
				System.out.print(data+" ");
			
			}
			System.out.println();
		}
		
		
	}

}
