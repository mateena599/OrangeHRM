package com.AsignmentOnOrangeHRM;

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
import org.openqa.selenium.interactions.Actions;

public class OrangeHrmEmplyeeListTable {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		//Login to the OrangeHRM
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

		// //*[@id="resultTable"]/tbody/tr[1]/td[1]
        // //*[@id="resultTable"]/tbody/tr[1]/td[2]
		// //*[@id="resultTable"]/tbody/tr[1]/td[4]
		// //*[@id="resultTable"]/tbody/tr[9]/td[8]
		

		String part1="//*[@id=\"resultTable\"]/tbody/tr[";
	      String part2="]/td[";
	      String part3="]";
	      
	      FileInputStream file=new FileInputStream("./src/com/ExcelTestData/OrangeHrmEmplyeelist.xlsx");
	      XSSFWorkbook workbook=new XSSFWorkbook(file);
	      XSSFSheet sheet=workbook.getSheet("Sheet1");
	      
	      
	      for(int i=1;i<=9;i++)
	      {
	    	  Row row=sheet.createRow(i);
	    	  for(int j=1;j<=8;j++)
	    	  {
	    	  WebElement elementdata=driver.findElement(By.xpath(part1+i+part2+j+part3));
	    	  String data=elementdata.getText();
	    	  System.out.print(data+"   ");
	    	  
	  		  Cell cell=row.createCell(j);
    		  cell.setCellValue(data);
    
	    	  
	    	  }
	    	  System.out.println();
	  		FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestData/OrangeHrmEmplyeelist.xlsx");
    		workbook.write(file1);
	
		
	      }
	      
	      
	      

	}

}
