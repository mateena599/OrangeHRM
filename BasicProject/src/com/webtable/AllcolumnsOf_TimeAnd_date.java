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

public class AllcolumnsOf_TimeAnd_date {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null; 
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		//Find all the city names on the first column and last column  complete webtable
		
				// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		        // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
				
			
			String  part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";	
			String part2="]/td[";
		    String part3="]"	;
		
     	    FileInputStream file=new FileInputStream("./src/com/ExcelTestData/CompleteWebTable.xlsx");
			XSSFWorkbook workbook= new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
		    
		    
		    
		    for(int i=1;i<=36;i++)      //Goes to every row
		    {

	    		Row row=sheet.createRow(i);
		    	for(int j=1;j<=8;j++)//of every  row-internally goes to all the columns
		    	{
		    		WebElement CityWebElement=driver.findElement(By.xpath(part1+i+part2+j+part3));
		    		String data=CityWebElement.getText();
		    		System.out.print(data+"       ");

		    		Cell cell=row.createCell(j);
		    		cell.setCellValue(data);
		    		


		    	}
		    	System.out.println();
				FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestData/CompleteWebTable.xlsx");
	    		workbook.write(file1);
		
				
		    }
    
	
	}

}
