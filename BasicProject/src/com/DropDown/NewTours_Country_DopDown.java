package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Country_DopDown {

	public static void main(String[] args) {
		WebDriver driver=null; 
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
         driver.manage().window().maximize();
         //<a href="mercuryregister.php">REGISTER</a>
         
         WebElement register=driver.findElement(By.linkText("REGISTER"));
         register.click();
         
         //<select name="country" size="1">
//         <option value="2">ALBANIA </option>..........
         //going to country dropdown elemnt and finding all the elements in it by using "Option" tagname
         
         
         WebElement country=driver.findElement(By.name("country"));
         List<WebElement>countries=country.findElements(By.tagName("option"));
         int CountriesCount=countries.size();
         System.out.println("The number of countries in the country dropdown are:"+CountriesCount);
         
         for(int i=0;i<CountriesCount;i++)
         {
        	 String countryName=countries.get(i).getText();
        	 System.out.println(i+" "+countryName);
        	 		
         }
         
        
         //Select selection=new Select(country);
         //selection.selectByIndex(1);
         //selection.selectByValue("251");
         //selection.selectByVisibleText("INDIA");
         
       
	}

}
