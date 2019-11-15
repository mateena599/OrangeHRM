package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static void main(String[] args) 
	{
		//chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mateen\\Desktop\\MT\\BasicProject\\Driverfiles\\chromedriver.exe");
	    ChromeDriver chrome=new ChromeDriver();
	    
	    
	    
	    //Firefox browser
	    
	    System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
	    FirefoxDriver firefox= new FirefoxDriver();
	    
	    //Internet Explorer
	  
	    System.setProperty("webdriver.ie.driver", "./Driverfiles/IEDriverServer.exe");
	    InternetExplorerDriver ieBrowser= new  InternetExplorerDriver();
	    
	    //Edge Browser
	    
	    System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
	     EdgeDriver edge=new EdgeDriver();
	    
	    
	    
	    
	    
	    
	}

}
