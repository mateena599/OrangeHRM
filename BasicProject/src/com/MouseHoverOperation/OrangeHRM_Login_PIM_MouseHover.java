package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_Login_PIM_MouseHover {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
        String url="https://opensource-demo.orangehrmlive.com";
        System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
        driver= new ChromeDriver();
         driver.get(url);
      driver.manage().window().maximize();
      //<input name="txtUsername" id="txtUsername" type="text">
      //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
      //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
    WebElement  UserName=driver.findElement(By.id("txtUsername"));
    UserName.sendKeys("admin");
    WebElement  password=driver.findElement(By.id("txtPassword"));
    password.sendKeys("admin123");
      WebElement logIn=driver.findElement(By.id("btnLogin")); 
      logIn.click();
      //<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" 
      //class="firstLevelMenu"><b>PIM</b></a>
      WebElement  pim=driver.findElement(By.id("menu_pim_viewPimModule"));
      Actions action=new Actions(driver);
      action.moveToElement(pim).perform();
    
      //Element which ishidden under pim element. selenium web driver cannot directly automate any hidden element.
      //in order to automate the hidden element those hidden elemnt- 
      //should be visible first
      //selenium web driver can automate hidden or invisible element once they are visible
      //<a href="/index.php/pim/addEmployee"
      //<a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
      	WebElement addEmpyee=driver.findElement(By.id("menu_pim_addEmployee"));
      	addEmpyee.click();
        
      	
       String expected="https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee";
        String actual=driver.getCurrentUrl();
        if(actual.equals(expected))
        {
      	  System.out.println("AddEmployee page is opened succefuly---passed");
        }
        else
        {
      	  System.out.println("AddEmployee page is not opened---failed");
        }
        
        
        
        
      	
	}

}
