package com.webtable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeAndDate_CaptuingFirstColumn {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null; 
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

/*
		//Find the First element
		
		//<a href="/worldclock/ghana/accra">Accra</a>
				WebElement CityElement=driver.findElement(By.linkText("Accra"));
		String CityName=CityElement.getText();
		System.out.println(CityName);
*/
	
		
		
/*		
		//Find all the city names on the first column
		
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
        // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
	
		
		for(int i=1;i<=36;i++)
		{
		
		WebElement CitynameElement=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]"));
		
		String cityname=CitynameElement.getText();
		System.out.println(i+"  "+cityname);
	    }
*/		
		
	     //OR
		
	//Find all the city names on the first column
		
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
        // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		
		String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		
		String part2="]/td[1]";
		
		FileInputStream file=new FileInputStream("./src/com/ExcelTestData/FirstColumnNameTIMEANDDATE.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		for(int i=1;i<=36;i++)
		{
		
		WebElement cityNameElement=driver.findElement(By.xpath(part1+i+part2));
		String cityname=cityNameElement.getText();
		System.out.println(i+"  "+cityname);
		
		
		Row row=sheet.createRow(i);
		Cell cell=row.createCell(0);
		cell.setCellValue(i);
		
		Cell cell1=row.createCell(1);
		cell1.setCellValue(cityname);
		
		
	    
		}
		

		FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestData/FirstColumnNameTIMEANDDATE.xlsx");
		workbook.write(file1);

		
		

			
		
		
driver.quit();
		
		
	}
		

}
