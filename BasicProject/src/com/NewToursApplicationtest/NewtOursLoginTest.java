package com.NewToursApplicationtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtOursLoginTest {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
//<input type="text" name="userName" size="10">
//<input type="password" name="password" size="10">		
//	<input type="image" name="login" 	
	
		FileInputStream file=new FileInputStream("./src/com/ApplicationTesTDataFiles/Application_Testdata_Files.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
          
		for(int i=1;i<=rowcount;i++)
		{
			Row row=sheet.getRow(i);
			driver.findElement(By.name("userName")).clear();
			driver.findElement(By.name("userName")).sendKeys(row.getCell(0).getStringCellValue());
			
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(row.getCell(1).getStringCellValue());
			
			driver.findElement(By.name("login")).click();
			
			
			String Expected_HomepageTitle="Find";
			System.out.println("The expected HomePage title is"+Expected_HomepageTitle);
			
			String Actual_HomePageTitle=driver.getTitle();
			System.out.println("The actual HomePage Title is"+Actual_HomePageTitle);
			
			if(Actual_HomePageTitle.contains(Expected_HomepageTitle))
			{
				System.out.println("Login Succefull-PASS");
				row.createCell(2).setCellValue("Login Succefull-PASS");
			}
			else
			{
				System.out.println("Login Failed-FAILED");
				row.createCell(2).setCellValue("Login Failed-FAILED");
			}
			
			FileOutputStream file1= new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_Result.xlsx");
			workbook.write(file1);
			
			driver.navigate().back();
			//driver.navigate().refresh();
			
			
			
		}
	
		
		
		
	}

}
