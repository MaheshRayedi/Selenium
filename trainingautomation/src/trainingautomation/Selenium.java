package trainingautomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Selenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\Rayedi Mahesh\\Desktop\\table.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet s = wb.getSheet("sheet1");
		
		int row = s.getLastRowNum();
		
		int column =  s.getRow(0).getLastCellNum();
		
		for(int i=0; i<=row; i++) {//read to use each row
		XSSFRow currentrow = s.getRow(i);
		for(int j=1;j<column;j++) {//read to use cell on current row
		String value = currentrow.getCell(j).toString();
		System.out.println(value);
		}
		}
	}

}
