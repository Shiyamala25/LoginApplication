package org.adactinDataDriven;

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

public class AdactinHotelDd {

	public static void main(String[] args) throws IOException {

		// Location of Excel
		File f = new File("C:\\Users\\vignesh\\eclipse-workspace\\Maven_Login\\Excel\\InputData.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("DATA");

		int noOfRows = s.getPhysicalNumberOfRows();		
		for (int i = 0; i < noOfRows; i++) {
			Row r = s.getRow(i);

			int noOfCells = r.getPhysicalNumberOfCells();									
			for(int j=0; j<noOfCells; j++) {
				Cell c = r.getCell(j);
				
				int type = c.getCellType();	
				if(type==1) {
					String value = c.getStringCellValue();
					System.out.println(value);
				}else if(DateUtil.isCellDateFormatted(c)){
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					Date d = c.getDateCellValue();
					String val = sim.format(d);
					System.out.println(val);
				}else{
					double d = c.getNumericCellValue();
					long l = (long)d;
					String value = String.valueOf(l);
					System.out.println(value);
				}
				
			}

		}
	}

}
