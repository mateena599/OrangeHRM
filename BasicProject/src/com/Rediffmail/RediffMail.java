package com.Rediffmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RediffMail {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null; 
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		//<a href="//register.rediff.com/register/register.php?FormName=user_details">Create a new account</a>
	    WebElement  createAccount_Link=driver.findElement(By.linkText("Create a new account"));
	    createAccount_Link.click();
	    
	    
	    
	    
	    //<input type="text" onblur="fieldTrack(this);" name="name8a10727f" 
	    //value="" style="width:185px;" maxlength="61">
	    ////*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input
	   
	    
/*WebElement  fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
*/	                            
	    //Or
	    
	    /*WebElement  fullname=driver.findElement(By.xpath("//*[@type='text']"));
	    WebElement  fullname=driver.findElement(By.xpath("//input[@type='text']"));
		fullname.sendKeys("Sameer bhagawat");
		*/
	    
	    
	    
	    
	    //Automating using name locator
	    

	    //  //*[@id="tblcrtac"]
	    //  //*[@id="tblcrtac"]/tbody/tr[3]/td[1]
	   //   //*[@id="wrapper"] 
	    //  //*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input
	    
	    WebElement  fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[1]"));
		String ss=fullname.getText();
		System.out.println(ss);
	    Actions action=new Actions(driver);
	    action.moveToElement(fullname).perform();
	    action.sendKeys("Mateen Ahmed").perform();
		
	    
	    
		
	}

}
