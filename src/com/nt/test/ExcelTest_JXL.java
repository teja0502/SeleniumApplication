package com.nt.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelTest_JXL {

	public static void main(String[] args) throws BiffException, IOException {
		
		FileInputStream io= new FileInputStream("E:\\Selenium Jars\\ReadExcel.xls");
		//Add jxl.jar file to class path for getting this class.
		//is used to retraive the sheets from excel.
		Workbook wb = Workbook.getWorkbook(io);
		//sheet agrs is used get one particular sheet data
		Sheet sheet=wb.getSheet(0);
		//get the no od rows in excel file.
		int row=sheet.getRows();
		for(int i=0;i<row;i++) {
		//get the data from file.
		String empno=  sheet.getCell(0, i).getContents();
		String name=  sheet.getCell(1, i).getContents();
		String addrs=  sheet.getCell(2 ,i).getContents();
		String avg=  sheet.getCell(3, i).getContents();
		//print data data.
		System.out.println(empno+" "+name+" "+addrs+" "+avg);
		
		}
				
	}

}
