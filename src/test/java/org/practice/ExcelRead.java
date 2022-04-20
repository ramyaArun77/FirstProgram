package org.practice;

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



public class ExcelRead {
public static Object[][] main(String[] args) throws IOException {
	
	File location=new File("D:\\New folder\\MavenProject1\\src\\test\\resources\\School1.xlsx");
	
	FileInputStream fi=new FileInputStream(location);
	
	Workbook w=new XSSFWorkbook(fi);
	
	Sheet s = w.getSheet("Class8");
	
	Row r = s.getRow(2);
	Cell c = r.getCell(0);
	
	int rcnt = s.getPhysicalNumberOfRows();
	int ccnt = r.getPhysicalNumberOfCells();
	
	String value;
	Object[][] obj=new Object[rcnt-1][ccnt];
	
	for(int i=0;i<rcnt-1;i++) {
		Row rr = s.getRow(i);
		for(int j=0;j<ccnt;j++) {
			Cell cc = rr.getCell(j);
			int cellType = cc.getCellType();
			if(cellType == 2) {
				value= cc.getStringCellValue();
			}else if(DateUtil.isCellDateFormatted(cc)) {
//			 Date dateCellValue = cc.getDateCellValue();
//			 SimpleDateFormat v=new SimpleDateFormat("dd-mmm-yyyy");
//			 value = v.format(cc);
				
				 value = new SimpleDateFormat("dd-mmm-yyyy").format(cc.getDateCellValue());
			}
			else {
			  double numericCellValue = cc.getNumericCellValue();
			  long l=(long)numericCellValue;
			  value=String.valueOf(l);
			}
			obj[i][j]=value;
			}
	}
	return obj;
	}
}

	
	
	

