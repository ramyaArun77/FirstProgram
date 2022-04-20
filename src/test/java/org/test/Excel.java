package org.test;

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
import org.openqa.selenium.remote.server.handler.FullscreenWindow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	File loc =new File("D:\\New folder\\MavenProject1\\src\\test\\resources\\Login.xlsx");
	FileInputStream f=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(f);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(2);
	Cell cell = r.getCell(0);
	System.out.println(cell);
	int type = cell.getCellType();
	System.out.println(type);
	if(type==1) {
		String value = cell.getStringCellValue();
	}
	else {
		if(DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat sf=new SimpleDateFormat();
			String value = sf.format(date);
		}
		else {
			double db = cell.getNumericCellValue();
			long l=(long) db;
			String value = String.valueOf(l);
			System.out.println(value);
		}
	}

	
}

}
