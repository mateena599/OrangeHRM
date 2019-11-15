package com.POM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class signOnTest extends BaseTest
{
  @Test(priority=1)
   public void signOnTest()
   {
	  LogInPage pil=PageFactory.initElements(driver, LogInPage.class);
      pil.signOn();
	   System.out.println(driver.getCurrentUrl());

   }
   @Test(priority=2)
   public void RegisterTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.register();
	   System.out.println(driver.getCurrentUrl());
   }
   @Test(priority=3)
   public void SupportTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Support();
	   System.out.println(driver.getCurrentUrl());

   }
   
   @Test(priority=4)
   public void ContactTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Contact();
	   System.out.println(driver.getCurrentUrl());

   }
   @Test(priority=5)
   public void Hometest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Home();
	   System.out.println(driver.getCurrentUrl());

   }
   @Test(priority=6)
   public void FlightsTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Flights();
	   System.out.println(driver.getCurrentUrl());

   }
   @Test(priority=7)
   public void HotelsTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Hotels();
	   System.out.println(driver.getCurrentUrl());

   }
   @Test(priority=8)
   public void CarRentalsTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.CarRentals();
	   System.out.println(driver.getCurrentUrl());

   }
   @Test(priority=9)
   public void CruisesTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Cruises();
	   System.out.println(driver.getCurrentUrl());

   }
   @Test(priority=10)
   public void DestinationsTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Destinations();
	   System.out.println(driver.getCurrentUrl());

   }
   @Test(priority=11)
   public void Vacations1Test()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Vacations();
	   System.out.println(driver.getCurrentUrl());

   }

  @Test(priority=12)
   public void userLoginTest() throws IOException
   {
	  FileInputStream file=new FileInputStream("./src/com/ApplicationTesTDataFiles/Application_Testdata_Files.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(file);
	  XSSFSheet sheet=workbook.getSheet("Sheet1");
	  
	  int rowCount=sheet.getLastRowNum();
	  for(int i=1;i<=rowCount;i++)
	  {
		Row row=sheet.getRow(i); 
		
	  
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.userLogin(row.getCell(0).getStringCellValue(),row.getCell(1).getStringCellValue());
	  
	   String Expected_Title="Find";
	   System.out.println("The Expected Title is: "+Expected_Title);
	   String Actual_Title=driver.getTitle();
	   System.out.println("The Actual Title is: "+Actual_Title);
	   
	   if(Actual_Title.contains(Expected_Title))
	   {
		   System.out.println("Login successfull-PASS");
		   row.createCell(2).setCellValue("Login successfull-PASS");
	   }
	   else
	   {
		   System.out.println("Login Failed-FAILED");
		   row.createCell(2).setCellValue("Login Failed-FAILED");
	  
	   }
	   FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestResultFiles/Newtours_LoginTest_ResultFile.xlsx");
	   workbook.write(file1);
	   driver.navigate().back();
	  }
   }

   @Test(priority=13)
   public void SpecialsTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Specials();
	   

   }
   
   @Test(priority=14)
   public void TourTipsTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.TourTips();
	   

   }
   @Test(priority=15)
   public void DestinationTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Destination();
	   

   }

   @Test(priority=16)
   public void VacationsTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Vacations();
	   

   }
   @Test(priority=17)
   public void RegisterhereTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.Registerhere();
	   

   }
      
   @Test(priority=18)
   public void BusinessTravelLinkTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.BusinessTravelLink();
	   

   }
   
   @Test(priority=19)
   public void SalonTest()
   {
	   LogInPage pil=PageFactory.initElements(driver,  LogInPage.class);
	   pil.salon();
	   

   }

   
   
}
