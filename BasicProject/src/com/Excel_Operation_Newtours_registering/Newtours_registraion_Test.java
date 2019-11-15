package com.Excel_Operation_Newtours_registering;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Newtours_registraion_Test {

	public static void main(String[] args) throws IOException 
	{
		 
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//<a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
	    register.click();
		
		FileInputStream file=new FileInputStream("./src/com/ApplicationTesTDataFiles/Excel_Registration_TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	    
		// //<input maxlength="60" name="firstName" size="20">
	
		WebElement firstname=driver.findElement(By.name("firstName"));
		Row row=sheet.getRow(1);
		firstname.sendKeys(row.getCell(0).getStringCellValue());
		
		//<input maxlength="60" name="lastName" size="20">
		
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys(row.getCell(1).getStringCellValue());

		//<input maxlength="20" name="phone" size="15">
		
		//String to integer conversion
		//int a=1000;
		//String str1 = Integer.toString(a); 
		
		/*Cell cell1 = sheet1.getRow(i).getCell(0);   
        //SET AS STRING TYPE
        cell1.setCellType(Cell.CELL_TYPE_STRING);
        String data0= cell1.getStringCellValue();
        System.out.println("Test Data From Excel : "+data0);
		*/
		
		//type conversion from int to string
		// integer to long
		//long to string
		WebElement phone=driver.findElement(By.name("phone"));
		double cellvalue=row.getCell(2).getNumericCellValue();
		long cell2=(long)cellvalue;
		String data=Long.toString(cell2);
		phone.sendKeys(data);
		
		
		
         
		//<input name="userName" id="userName" size="35" maxlength="64">
		WebElement userName=driver.findElement(By.id("userName"));
		userName.sendKeys(row.getCell(3).getStringCellValue());
         
		//<input maxlength="60" name="address1" size="40">
		WebElement Address1=driver.findElement(By.name("address1"));
		Address1.sendKeys(row.getCell(4).getStringCellValue());
        
		//<input maxlength="60" value="" size="40" name="address2">
		
		WebElement Address2=driver.findElement(By.name("address2"));
		Address2.sendKeys(row.getCell(5).getStringCellValue());
        
	   //<input maxlength="60" name="city" size="15">
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys(row.getCell(6).getStringCellValue());
        
		//<input maxlength="40" name="state">
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys(row.getCell(7).getStringCellValue());
        
	//<input maxlength="20" name="postalCode" size="15">
		WebElement pincode=driver.findElement(By.name("postalCode"));
		double a=row.getCell(8).getNumericCellValue();
		long z=(long)a;
		String postal=Long.toString(z);
		pincode.sendKeys(postal);
		
		//<select name="country" size="1">
       // <option value="2">ALBANIA </option>
        
		WebElement country=driver.findElement(By.name("country"));
		country.sendKeys(row.getCell(9).getStringCellValue());
		
		//<input name="email" id="email" size="20" maxlength="60">
		WebElement Usrname=driver.findElement(By.name("email"));
		Usrname.sendKeys(row.getCell(10).getStringCellValue());
       
		//<input maxlength="60" name="password" size="20" type="password">
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(row.getCell(11).getStringCellValue());
       
		//<input maxlength="60" name="confirmPassword" size="20" type="password">
		
		WebElement confirmPassword=driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys(row.getCell(12).getStringCellValue());
       
		
		
	    //<input type="image" name="register" 
		//src="/images/forms/submit.gif" width="60" height="23" border="0">
		
		WebElement submit=driver.findElement(By.name("register"));
		submit.click();
       
		
		
		
		// Validating with the firstname and lastname as no element is found after submitting
		
		String expected_name="maheboob";
		System.out.println("The expected Name "+expected_name);
		
		String actual_Name=driver.findElement(By.tagName("b")).getText(); 
		System.out.println("The Actual Name"+actual_Name); 
		
		
		
// Also validating with xpath of Username displayed after successfull registration
		
///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b
		
		
		/*String expected_name="maheboob";
		System.out.println("The expected Name "+expected_name);
		String actual_Name=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println("The Actual Name"+actual_Name);
		*/
		
		
		
		
		if(actual_Name.contains(expected_name))
		{
			System.out.println("Registration successfull--PASSED");
			row.createCell(13).setCellValue("Registration successfull--PASSED");
		}
		else
		{
			System.out.println("Registration Unsuccessfull--FAILED");
			row.createCell(13).setCellValue("Registration Unsuccessfull--FAILED");
		}
		
		FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestResultFiles/Newtours_Registration_result.xlsx");
		workbook.write(file1);
		
	}

}