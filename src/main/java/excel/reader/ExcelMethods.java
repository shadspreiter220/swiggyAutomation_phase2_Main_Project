package excel.reader;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethods {
	
	
	public static void main(String[] args) throws  IOException  {
		
		//This is for Taking a file as an Input
		XSSFWorkbook wrkbk = new XSSFWorkbook(new FileInputStream("C:\\Users\\sspreiter.ECO\\eclipseWorkspace\\PH2Project\\src\\main\\resources\\Swiggy_TestData.xlsx"));
		
		//Read Sheet
		XSSFSheet sheet = wrkbk.getSheetAt(0);
		
		//Read Data
		String dish = sheet.getRow(2).getCell(2).toString();
		
		System.out.println(dish);
		
		//Print number of rows
		int rowNmbr = sheet.getLastRowNum();
		System.out.println("Index of Last row is " +rowNmbr);
		
		int colNmbr = sheet.getRow(0).getLastCellNum();
		System.out.println("Index of Last Collumn is " +colNmbr);
		
		for(int i=0; i <= rowNmbr; i++) {
			String rn = sheet.getRow(i).getCell(0).toString();
			String rn1 = sheet.getRow(i).getCell(1).toString();
			String rn2 = sheet.getRow(i).getCell(2).toString();
			String rn3 = sheet.getRow(i).getCell(3).toString();
			System.out.print(rn +" ");
			System.out.print(rn1 +" ");
			System.out.print(rn2 +" ");
			System.out.println(rn3 +" ");
		}
		
		}
	
}
		
	

