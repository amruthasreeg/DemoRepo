package org.hexa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task4
{
 public static void main(String args[]) throws IOException
 {
	 File f=new File("C:\\Users\\AmmuAnu\\eclipse-workspace\\SampleMaven\\Excel\\hello.xlsx");
	 Workbook w=new XSSFWorkbook();
	 Sheet s=w.createSheet("Data");
	 Row r=s.createRow(0);
	 Cell c=r.createCell(0);
	 c.setCellValue("Java");
	 FileOutputStream fos=new FileOutputStream(f);
	 w.write(fos);
	 System.out.println("done..");
 }
}
