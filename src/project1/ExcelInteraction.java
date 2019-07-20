package project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelInteraction {

	public static void main(String[] args) {
		
/*ArrayList<String> x=readFromExcel( "E:\\Selenium\\Project\\Project\\Resources\\Test_data.xls","Sheet2",1,1);
for(int i=0;i<x.size();i++)
{
	System.out.println(x.get(i));
}
*/	}
	
	
	
	
	
	public static void WriteExcel(String filepath, String sheetname, ArrayList<String> a1 ) throws FileNotFoundException {
		
		
		File src = new File(filepath);
		FileOutputStream fos = new FileOutputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sh1 = wb.getSheet(sheetname);
		for(int i =0; i<a1.size(); i++) {
			
			
		}
		
		
	}
	
	






	public static ArrayList<String>  readFromExcel(String filePath,String sheetName) 
	{
		String sdata;
		ArrayList<String> aList=new ArrayList<String>();
		try {

			File src=new File(filePath);
			FileInputStream fis=new FileInputStream(src);
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sh1= wb.getSheet(sheetName);
			int iCol=0;
			int noOfColumn=sh1.getRow(0).getPhysicalNumberOfCells();
			for(int i=0;i<noOfColumn;i++)
			{
				 sdata=sh1.getRow(0).getCell(i).getStringCellValue();
				 aList.add(sdata);
			}
			fis.close();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			sdata=null;
		}
		return aList;
	}

}
