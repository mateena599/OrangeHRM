package com.MouseHoverOperation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assignment {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

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
      	  System.out.println("Orange HRM  page is opened succefuly---passed");
        }
        else
        {
      	  System.out.println("Orange HRM page is not opened---failed");
        }
        
        //<a href="#" id="welcome" class="panelTrigger activated-welcome">
      //<a href="#" data-dismiss="modal" id="aboutDisplayLink">About</a>
       //<a href="/index.php/auth/logout">Logout</a>
        //<a href="#" id="welcome" class="panelTrigger 
        //activated-welcome">Welcome Admin</a>
       //possible ways
        
       /* WebElement  Welcome_admin=driver.findElement(By.linkText("Welcome Admin"));
        Actions action=new Actions(driver);
        action.moveToElement(Welcome_admin).perform();
        Welcome_admin.click();
       
        WebElement about= driver.findElement(By.id("aboutDisplayLink"));
        about.click();
    
        WebElement logout= driver.findElement(By.linkText("Logout"));
        action.moveToElement(logout);
        action.click();
         action.perform();
        
        */
        //   one
        
      /* 
       WebElement  Welcome_admin=driver.findElement(By.id("welcome"));
       Actions action=new Actions(driver);
       action.moveToElement(Welcome_admin).perform();
       Welcome_admin.click();
      
       WebElement about= driver.findElement(By.id("aboutDisplayLink"));
       about.click();
   
       WebElement logout= driver.findElement(By.linkText("Logout"));
       logout.click();
        */
        
        // two
        
        
        WebElement  Welcome_admin=driver.findElement(By.id("welcome"));
        Welcome_admin.click();

        
        WebElement Logout=driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a"));
        Actions action=new Actions(driver);
        action.moveToElement(Logout).perform();
        Logout.click();
      
        
//      //#welcome-menu > ul > li:nth-child(2) > a
        
        // but it is not letting me directly interact with logout element
        
     
        
       
   
     

	}

}
