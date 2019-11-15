package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_Single_Test_Data {

	public static void main(String[] args) throws IOException
	{
		
		//Identify the file in the system
		
		FileInputStream file=new FileInputStream("./src/com/ExcelTestData/Selenium_Single_data_read.xlsx");
		
		//Identify The Workbook in the file
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		//Identify the sheet in workbook
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//Identify the row in the sheet
		
		Row row=sheet.getRow(0);
	
		//Identify The cell In the Row
		
		Cell cell=row.getCell(0);
		
		//Get the Data from the Row of a cell ----String Type data

		String data=cell.getStringCellValue();
		
		System.out.println("The String Present in row-0 and cell-0--->"+data);
	}

}
