package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {

		//Location of Excel
		File f = new File("C:\\Users\\vignesh\\eclipse-workspace\\Maven_Login\\Excel\\InputData.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("DATA");
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(4);
		
		System.out.println(c);
	}

}
