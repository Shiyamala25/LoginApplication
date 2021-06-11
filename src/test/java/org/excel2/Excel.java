package org.excel2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\vignesh\\eclipse-workspace\\Maven_Login\\Excel\\InputData.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet ("Data");
		int noOfRows = s.getPhysicalNumberOfRows();
		//To iterate rows
		for(int i=0; i<noOfRows; i++) {
			Row r = s.getRow(i);
			int noOfCells = r.getPhysicalNumberOfCells();
			//To iterate the cells
			for(int j=0; j<noOfCells;j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				
				if(type==1) {
					//String
					String val = c.getStringCellValue();
					System.out.println(val);					
				}else if (DateUtil.isCellDateFormatted(c)) {
					//date
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					Date d = c.getDateCellValue();
					String val = sim.format(d);
					System.out.println(val);
				}else {
					//Number
					double d = c.getNumericCellValue();
					//type casting
					long l = (long)d;
					String val = String.valueOf(l);
					System.out.println(val);
					
				}
			}
		}
		
	}

}
