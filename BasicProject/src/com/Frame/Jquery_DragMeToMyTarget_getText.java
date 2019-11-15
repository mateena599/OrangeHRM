package com.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery_DragMeToMyTarget_getText {

	public static void main(String[] args)
	{
        WebDriver driver=null;
        String url="https://jqueryui.com/droppable/";
        System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        // iframe--source code---identifying the block of the elements which is frame
        //<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
        
        //switching into the frame of teh webpage-since the element cannot be directly identied
        
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        
        
        //<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
    	
        WebElement dragmetomytargetElemnt=driver.findElement(By.id("draggable"));
        String dragmetomytargetelemnt_gettext=dragmetomytargetElemnt.getText();
          System.out.println("The text of an element is----:"+dragmetomytargetelemnt_gettext);
          driver.quit();
	}

}
