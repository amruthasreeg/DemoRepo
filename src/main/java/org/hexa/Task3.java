package org.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task3 
{
  public static void main(String args[]) throws IOException
  {
	  File loc=new File("C:\\Users\\AmmuAnu\\eclipse-workspace\\SampleMaven\\Excel\\excel1.xlsx");
	  FileInputStream stream=new FileInputStream(loc);
	 
	  Workbook w=new XSSFWorkbook(stream);
	  Sheet s=w.getSheet("Sheet1");
	  Row r=s.getRow(0);
	  Cell c=r.getCell(0);
	  String value=c.getStringCellValue();
	  if(value.equals("NAME"))
	  {
		  c.setCellValue("USERNAME");
	  }
	  FileOutputStream fos=new FileOutputStream(loc);
	  w.write(fos);
	  System.out.println("done...");
  }
}
