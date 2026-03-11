package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

public class ExcelUtil {
	
	String Excelpath="C:\\Users\\hp\\eclipse-workspace\\seleniumwebdriver\\ExcelFile\\Test cases for Amazon.xlsx";
	
	@DataProvider(name="fetchdata")
	public Object[][] Excel() throws Exception {
		
		FileInputStream file=new FileInputStream(Excelpath);
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Testdata");
		
		int Totalrows= sheet.getLastRowNum();
				
		int Totalcells= sheet.getRow(0).getLastCellNum();
		
		Object Copieddata[][]= new Object[Totalrows][Totalcells];
		
		DataFormatter df=new DataFormatter();
		
		for(int r=1;r<=Totalrows;r++) {
			
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0;c<Totalcells;c++){
				
				
				XSSFCell currentcell=currentrow.getCell(c);
				
				Copieddata[r-1][c]=df.formatCellValue(currentcell);
				//Copieddata[r-1][c]= currentcell.toString();
			}
		}
		
		workbook.close();
		file.close();
		return Copieddata;
		
		
		
	}
	
	

}
