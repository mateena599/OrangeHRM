package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PraticeMultiple {

	public static void main(String[] args) throws IOException 
	{
         // when all the table of the excel is known 
		
		
		FileInputStream file=new FileInputStream("./src/com/ExcelTestData/Multiple.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
      
        for(int i=0;i<sheet.getLastRowNum();i++)
        {
        
        	String data=sheet.getRow(i).getCell(i).getStringCellValue();
        	System.out.print(data);

        	
        	String data1=sheet.getRow(i).getCell(i).getStringCellValue();
        	System.out.print("  "+data1);

        	System.out.println();
        	System.out.println("************");
        	
        	
        	
        }
    
  
       
 
}
}