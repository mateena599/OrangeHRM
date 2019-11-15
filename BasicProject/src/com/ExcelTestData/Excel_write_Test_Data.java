package com.ExcelTestData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_Test_Data {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file= new FileInputStream("./src/com/ExcelTestData/MultipleTestdata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		//Creating a row in the sheet
		Row row=sheet.createRow(3);
		
		// Creating a cell in the row
		Cell cell=row.createCell(4);
		//setting a value in the row of a cell
		cell.setCellValue("Livetech");
		cell.setCellValue("Technology");// if we write data into the sam,e row of a cell then the prevoius value will be replaced with the later value
		//Saving the file with the workbook
		FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestData/MultipleTestdata.xlsx");
		workbook.write(file1);
		
		

	}

}
