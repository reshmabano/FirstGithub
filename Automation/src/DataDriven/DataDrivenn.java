package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenn {

	public static void main(String[] args) throws Exception {

		File src = new File ("D:\\Coding Concept\\TestData.xlsx");
		FileInputStream fis = new FileInputStream (src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String data0 = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data from Row 1 Col 0 is " +data0);
		
		String data1 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data from Row 1 Col 1 is " +data1);
		
		wb.close();
		
		
	}

}
