package org.logout;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Logout {

	public static void main(String[] args) throws IOException {

		//Location of excel 
		
		File f = new File("C:\\Users\\vignesh\\eclipse-workspace\\Maven_Login\\Excel\\OutputData.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("TicketNo");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Java");
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("Done");
	}

}
