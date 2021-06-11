package org.logout2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Logout2 {

	public static void main(String[] args) throws IOException {

		//Location of excel
		File f = new File("C:\\Users\\vignesh\\eclipse-workspace\\Maven_Login\\Excel\\OutputData.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("TicketNo");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String val = c.getStringCellValue();
		if(val.equals("Java")) {
			c.setCellValue("Selinium");
			FileOutputStream fout = new FileOutputStream(f);
			w.write(fout);			
		}
		System.out.println("Done");
	}

}
