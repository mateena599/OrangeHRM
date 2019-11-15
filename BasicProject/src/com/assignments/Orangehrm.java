package com.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Orangehrm 
{
	public static void main(String[] args)
	{
		WebDriver driver=null; 
		String url="https://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
         driver.manage().window().maximize();
         
      
         
         
         
         
         String Expected_OrangeHRM_Page="https://opensource-demo.orangehrmlive.com/";
         System.out.println("The Expected OrangeHrm PAge is"+Expected_OrangeHRM_Page);
         
         String Actual_OrangeHRM_Page=driver.getCurrentUrl();
         System.out.println("The Actual OrangeHrm PAge is"+Actual_OrangeHRM_Page);
         
         if(Actual_OrangeHRM_Page.equals(Expected_OrangeHRM_Page))
         {
        	 System.out.println("Orange HRM page is opened-passed");
         }
         else
         {
        	 System.out.println("Orange HRM page is not opened-failed");

         }
         System.out.println("################################################################");

       //<input name="txtUsername" id="txtUsername" type="text">
         //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
         //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
       WebElement  UserName=driver.findElement(By.id("txtUsername"));
       UserName.sendKeys("admin");
       WebElement  password=driver.findElement(By.id("txtPassword"));
       password.sendKeys("admin123");
         WebElement logIn=driver.findElement(By.id("btnLogin")); 
         logIn.click();
         
         

 		//validating page using Title . also done with Current url method
 		
 		String expected_OHRMTitle="OrangeHRM";
 		System.out.println("The expected title of Orange hrm is-->"+expected_OHRMTitle);
         String actual_OHRMTitle=driver.getTitle();
         System.out.println("The actual tilte of orange hrm is-->"+actual_OHRMTitle);
         
         if(actual_OHRMTitle.equals(expected_OHRMTitle))
         {
       	  System.out.println("OrangeHRM logged in successfully---passed");
         }
         else
         {
       	  System.out.println("OrangeHRM page LOgin unsuccessfull---failed");
         }
         System.out.println("################################################################");
        
         //<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" 
         //class="firstLevelMenu"><b>PIM</b></a>
         WebElement  pim=driver.findElement(By.id("menu_pim_viewPimModule"));
         Actions action=new Actions(driver);
         action.moveToElement(pim).perform();
         
         
         
         
         
       //<a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
       	WebElement addEmpyee=driver.findElement(By.id("menu_pim_addEmployee"));
       	String expected=addEmpyee.getAttribute("href");
       	addEmpyee.click();
       	
        //<a href="/index.php/pim/addEmployee" 
      
         String actual=driver.getCurrentUrl();
         if(actual.equals(expected))
         {
       	  System.out.println("AddEmployee page is opened succefuly---passed");
         }
         else
         {
       	  System.out.println("AddEmployee page is not opened---failed");
         }
         System.out.println("################################################################");
  
         //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
         //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
         //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
        
         WebElement firstname=driver.findElement(By.id("firstName"));
         firstname.sendKeys("MOHAMMED");
         Actions action2=new Actions(driver);
        
         action2.sendKeys(Keys.TAB).perform();
         action2.sendKeys("MATEEN").perform();
         action2.sendKeys(Keys.TAB).perform();
         action2.sendKeys("AHMMED").perform();
         
         
    
         //<input class="formInputText valid" maxlength="10" type="text" 
     //  name="employeeId" value="0010" id="employeeId">
         
         WebElement employee_id=driver.findElement(By.id("employeeId"));
         String EmpIDvalue=employee_id.getAttribute("value");
         System.out.println("The value of employee id is:---"+EmpIDvalue);
        
         
         System.out.println("################################################################");
   
         
         
         
         //<a href="/index.php/pim/viewEmployeeList/reset/1"
         //id="menu_pim_viewEmployeeList">Employee List</a>
         
         //<input type="button" class="" id="btnSave" value="Save">
         
       
         
         WebElement btnsave=driver.findElement(By.id("btnSave"));
        Actions action3=new Actions(driver);
      
         action3.moveToElement(btnsave).perform();
         btnsave.click();
         
          //<a href="/index.php/pim/viewEmployeeList/reset/1" 
         //id="menu_pim_viewEmployeeList">Employee List</a> 
         
         WebElement employeelist=driver.findElement(By.id("menu_pim_viewEmployeeList"));
         employeelist.click();
        //<a href="/index.php/pim/viewEmployee/empNumber/4">Steven</a>
         WebElement steven=driver.findElement(By.linkText("Steven"));
         steven.click();
         
         //first name
//<input value="Steven" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name"
//id="personal_txtEmpFirstName" disabled="disabled">         
          //last name
//<input value="Edwards" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" 
//id="personal_txtEmpLastName" disabled="disabled">         
         //Employee id
         //<input value="0004" type="text" name="personal[txtEmployeeId]" maxlength="10" 
         //class="editable" id="personal_txtEmployeeId" disabled="disabled">
         
         WebElement firstnme=driver.findElement(By.id("personal_txtEmpFirstName"));
         String Actual_firstName=firstnme.getAttribute("value");
      
         
         WebElement lastnme=driver.findElement(By.id("personal_txtEmpLastName"));
         String Actual_lastName=lastnme.getAttribute("value");
         
        
        String Expected_Firstname="Steven";
         String Expected_LastName="Edwards";
         if(Actual_firstName.equals(Expected_Firstname))
         {
        	if(Actual_lastName.equals(Expected_LastName)) 
        	{
     System.out.println(" Result is passsed and The fullname of the Employee is:: "+Actual_firstName+"  "+Actual_lastName);
        	} 
             
          
         }
         else
         {
        	 System.out.println("The fullName ofthe employee is not valid----failed");
         
         
         }
         
         
         WebElement Pemp_id=driver.findElement(By.id("personal_txtEmployeeId"));
         String Expected_Emp_id="0004";
         String Actual_emp_id=Pemp_id.getAttribute("value");
         
      
         
         if(Expected_Emp_id.equals(Actual_emp_id))
         {
        	 System.out.println("Employee is validated and matched--passed--->"+Actual_emp_id);
         }
         else
         {
        	 System.out.println("Employee is not validated and not matches--failed");
 
         }
         
         driver.navigate().to(Expected_OrangeHRM_Page);
         
         
         WebElement  Welcome_admin=driver.findElement(By.id("welcome"));
         Welcome_admin.click();

         
         WebElement Logout=driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a"));
         Actions action4=new Actions(driver);
         action4.moveToElement(Logout).perform();
         Logout.click();
         
         driver.quit();
         
}
}