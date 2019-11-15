package com.RadioButtons_EchoEcho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_EchoEcho {

	public static void main(String[] args)
	{
       WebDriver driver=null;
       String url="http://www.echoecho.com/htmlforms10.htm";
       System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
       driver=new ChromeDriver();
       driver.get(url);
       driver.manage().window().maximize();
       
       
       //Identifying radio buttons block
///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
       
      WebElement radioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
      
   //<input type="radio" name="group1" value="Milk">
    //<input type="radio" name="group1" value="Butter" checked="">
      //<input type="radio" name="group1" value="Cheese">
      
      List<WebElement>RadioButtons=radioButtonsBlock.findElements(By.name("group1"));
      
      int radiobuttonscount=RadioButtons.size();
      System.out.println("************GROUP1**************");
      System.out.println("The number of radio buttons are:"+radiobuttonscount);
      for(int i=0;i<radiobuttonscount;i++)//to perform click on each radio button
      {
    	  RadioButtons.get(i).click();// automating a radio button
    	  //geting the status of radio buttons
    	  
    	  for(int j=0;j<radiobuttonscount;j++)
    	  {
    		  //if we dont know the attribute of the element we have towrite isselected()method
    		 // System.out.println(RadioButtons.get(j).getAttribute("value")+" - "+RadioButtons.get(j).getAttribute("checked"));
    		  System.out.println(RadioButtons.get(j).getAttribute("value")+" - "+RadioButtons.get(j).isSelected());

    	  }
      }
      
      
      
      System.out.println("************GROUP2**************");

      //<input type="radio" name="group2" value="Water">
      //<input type="radio" name="group2" value="Beer">
      //<input type="radio" name="group2" value="Wine" checked="">
      
      
    List<WebElement>RadioButton=radioButtonsBlock.findElements(By.name("group2"));
      
      int RadioButtonCount=RadioButton.size();
  
      System.out.println("The number of radio buttons are:"+RadioButtonCount);
      for(int i=0;i<RadioButtonCount;i++)//to perform click on each radio button
      {
    	  RadioButton.get(i).click();// automating a radio button
    	  //geting the status of radio buttons
    	  
    	  for(int j=0;j<RadioButtonCount;j++)
    	  {
    		  //if we dont know the attribute of the element we have towrite isselected()method
    		 // System.out.println(RadioButtons.get(j).getAttribute("value")+" - "+RadioButtons.get(j).getAttribute("checked"));
    		  System.out.println(RadioButton.get(j).getAttribute("value")+" - "+RadioButton.get(j).isSelected());

    	  }
      }
      
      
      
      
      
      
      
	}

}
