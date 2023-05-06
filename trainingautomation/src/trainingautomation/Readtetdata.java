package trainingautomation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readtetdata {
	
	
	public FileInputStream file;
	public String path;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	
public String getcelldata(String SheetName, int rownum, int colnum) throws IOException
	
{
		
		file = new FileInputStream("C:/Users/Rayedi Mahesh/Desktop/Selenium drivers/credentials.xlsx");
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet("Sheet1");
		row = sheet.getRow(rownum);
		cell =  row.getCell(colnum);
		//int out1 = (int) cell.getNumericCellValue();
		String out = (String) cell.getStringCellValue();
		System.out.println(out);
		return out;
		
		
	    // create a loop to create

	    

	}
public String getcelldata1(String SheetName, int rownum, int colnum) throws IOException

{
		
		file = new FileInputStream("C:/Users/Rayedi Mahesh/Desktop/Selenium drivers/credentials.xlsx");
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet("Sheet1");
		row = sheet.getRow(rownum);
		cell =  row.getCell(colnum);
		//int out1 = (int) cell.getNumericCellValue();
		String out1 = (String) cell.getStringCellValue();
		System.out.println(out1);
		return out1;
		
		
	    // create a loop to create

	    

	}


	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		Readtetdata r  = new Readtetdata();
		r.getcelldata("Sheet1", 1, 0);
		r.getcelldata("Sheet1", 1, 1);
		

	}

}
