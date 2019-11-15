package com.ExcelNewtorsImport;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Newtours_CountriesName_Import {

	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver=null; 
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();



		WebElement country=driver.findElement(By.name("country"));
		List<WebElement>countries=country.findElements(By.tagName("option"));
		int CountriesCount=countries.size();
		System.out.println("The number of countries in the country dropdown are:"+CountriesCount);


		FileInputStream file=new FileInputStream("./src/com/ExcelTestData/ExcelAssigment.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");

		for(int i=0;i<CountriesCount;i++)
		{
			String countryName=countries.get(i).getText();
			System.out.println(i+" "+countryName);

			Row row=sheet.createRow(i);
			Cell cell=row.createCell(0);
			cell.setCellValue(i);
			Cell cell1=row.createCell(1);
			cell1.setCellValue(countryName);

			FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestData/ExcelAssigment.xlsx");
			workbook.write(file1);

		}
         
     
 
	}

}
