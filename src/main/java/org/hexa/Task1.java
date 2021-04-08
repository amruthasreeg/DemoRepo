package org.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1
{
	public static void main(String[]args) throws IOException
	{
		File loc=new File("C:\\Users\\AmmuAnu\\eclipse-workspace\\SampleMaven\\Excel\\excel1.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		
		if (s == null) 
		{
	      System.out.println("No sheet exists with name " + s);
		}
		
		/*Row row = s.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		int rows=s.getPhysicalNumberOfRows();
		System.out.println(rows);*/
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r = s.getRow(i);
			 for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			 {
				 Cell c=r.getCell(j);
				 //System.out.println(c);
				 int type=c.getCellType();
				 if(type==1)
				 {
					 String value=c.getStringCellValue();
					 System.out.println(value);
				 }
				 if(type==0)
				 {
					/* double d=c.getNumericCellValue();
					 long l=(long)d;
					 System.out.println(l);*/
					 boolean b=DateUtil.isCellDateFormatted(c);
					 if(b)
					 {
						 Date date=c.getDateCellValue();
						 SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
						 String date1=sim.format(date);
						 System.out.println(date1);
					 }
					 else
					 {
						 double d1=c.getNumericCellValue();
						 long l1=(long)d1;
						 String v=String .valueOf(l1);
						 System.out.println(v);
					 }
				 }
			 }
		}
		
	}
  
}
