package com.ExcelReadingAndWritingOrangeHRM;

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

public class OrangeHRmExcel {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("./src/com/ExcelTestData/OrangeHrmReadingandwriiting.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String UserName=cell.getStringCellValue();
		System.out.println(UserName);
		
		Cell cell1=row.getCell(1);
		String Password=cell1.getStringCellValue();
		System.out.println("password--********");
		
		//Login to the OrangeHRM
		WebElement  usernameelement=driver.findElement(By.id("txtUsername"));
		usernameelement.sendKeys(UserName);
		WebElement  password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(Password);
		WebElement logIn=driver.findElement(By.id("btnLogin")); 
		logIn.click();
         
		//Title 
		String ss=driver.getTitle();
		System.out.println(ss);
		
		//GetCurrentUrl
		
		String sss=driver.getCurrentUrl();
		System.out.println(sss);

		//Using Element 
		//<a href="/index.php/dashboard" id="menu_dashboard_index" class="firstLevelMenu"><b>Dashboard</b></a>
		
		
		WebElement DashElement=driver.findElement(By.id("menu_dashboard_index"));
		String ExpectedResult ="Dashboard";
		String ActualResult =DashElement.getText();
		System.out.println(ActualResult);
	    // String passed="PASSED";
	    // String failed="FAILED";
	     
	 	Row row1=sheet.createRow(1);
		Cell cell2=row1.createCell(2);
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("lOGIN SUCCESSFULL-----");
			cell2.setCellValue("PASSED");
		}
		else
		{
			System.out.println("lOGIN UNSUCCESSFULL----");
			cell1.setCellValue("FAILED");

		}
		
		FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestData/OrangeHrmReadingandwriiting.xlsx");
		workbook.write(file1);

	
		
	}

}
