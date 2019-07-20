package project1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelExample {

	public static void main(String[] args) {

		String expected = Readexceldata("D:\\Data.xls", "Sheet3", 1, 0);
		System.out.println("Expected Value: " + expected);

	}

	public static String Readexceldata(String Filepath, String Sheetname, int row, int col) {
		String data;

		try {

			File src = new File(Filepath);

			FileInputStream wb = new FileInputStream(src);
			HSSFWorkbook sh = new HSSFWorkbook(wb);
			HSSFSheet sh1 = sh.getSheet(Sheetname);
			data = sh1.getRow(row).getCell(col).getStringCellValue();

		} catch (Exception e) {

			System.out.println("Exception:" + e);
			data = null;
		}
		return data;

	}
}
