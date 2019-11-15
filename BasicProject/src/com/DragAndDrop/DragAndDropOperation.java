package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	public static void main(String[] args)
	{

        WebDriver driver=null;
        String url="https://jqueryui.com/droppable/";
        System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        
        WebElement dragmetomytargetElemnt=driver.findElement(By.id("draggable"));
        
        //< div id="droppable"
        
        WebElement dropmeElement=driver.findElement(By.id("droppable"));
        
        //Drag and Drop operation
        
        Actions action=new Actions(driver);
        action.dragAndDrop(dragmetomytargetElemnt, dropmeElement).perform();
        
        //switch back from the frame using defaultContent() method
        
        driver.switchTo().defaultContent();
        
        //automating Resizable element
        
        //<a href="https://jqueryui.com/resizable/">Resizable</a>
        
        WebElement resizable=driver.findElement(By.linkText("Resizable"));
        resizable.click();
        System.out.println("The title of the Resizable webpage is:"+driver.getTitle());
        //driver.quit();
        
        
        
        
        
	}

}
