package com.webtable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_TimeandDate_Alter {

	public static void main(String[] args) 
	{
		WebDriver driver=null; 
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		
		//identifying The WebTable
		
		///html/body/div[1]/div[6]/section[1]/div
		
		WebElement webtable=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
		
		// going to the Webtable and identifying the number of rows in it
	
		List <WebElement>rows=webtable.findElements(By.tagName("tr"));
	    int rowCount=rows.size();
	    for(int i=0;i<rowCount;i++) // got toeveryrow of the table
	    {
	    	//go tow every row and identify number of  columns in it
	    	List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
	    	int colsCount=cols.size();
	    	for(int j=0;j<colsCount;j++)// of every row getting all the columns
	    	{
	    		String data=cols.get(j).getText();
	    		System.out.print(data +"  ");
	    	}
	    	System.out.println();
	    }
	}

}
