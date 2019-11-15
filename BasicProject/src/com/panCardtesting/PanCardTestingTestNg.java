/*package com.panCardtesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PanCardTestingTestNg
{
@BeforeTest
public void SetUp()
{
	System.out.println("Pan Card Testing Example");
	System.out.println("**********************************************************");
}

@Test
public void PanTest() throws IOException
{
	FileInputStream file = new FileInputStream("./src/com/ApplicationTesTDataFiles/panCardTesting.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	
	
	
	
	
	int RowCount=sheet.getLastRowNum();
	
	for(int i=1;i<=RowCount;i++)
	{
		Row row=sheet.getRow(i);
		
		String ExpectedPanNumber=row.getCell(0).getStringCellValue();
		String ActualPanNumber=row.getCell(1).getStringCellValue();
		
		CellStyle style=workBook.createCellStyle();
		//style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
		
	     Font font=workBook.createFont();
	  
		if(ActualPanNumber.contentEquals(ExpectedPanNumber))
		{
			
			font.setColor(IndexedColors.GREEN.getIndex());
			style.setFont(font);
			System.out.println(ExpectedPanNumber+" -->"+ActualPanNumber+"  " + "EQUAL ");
			Cell cell=row.createCell(2);
			cell.setCellValue("PASSED");
			
			cell.setCellStyle(style);
		}
		else
		{
			
			font.setColor(IndexedColors.RED.getIndex());
			style.setFont(font);
			System.out.println(ExpectedPanNumber+" -->"+ActualPanNumber+ "   " + "NOTEQUAL ");
			Cell cell=row.createCell(2);
			cell.setCellValue("FAILED");
			cell.setCellStyle(style);
			
		}
		
		FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResultFiles/PanResultFile.xlsx");
		workBook.write(file1);

	}
	
	
	
}

@AfterTest
public void teardown()
{
	System.out.println("**********************************************************");
	System.out.println("Operation has Completed");
}

}
*/