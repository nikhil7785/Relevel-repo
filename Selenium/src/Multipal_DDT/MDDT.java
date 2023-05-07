package Multipal_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MDDT {
	public static void main(String[] args) throws IOException  {
		FileInputStream fs=new FileInputStream("F:\\Eclips_java\\Selenium\\Excel\\Manual Assignment_TC.xlsx");
		Workbook book = WorkbookFactory.create(fs);
		Sheet shet = book.getSheet("Functional Testing");
		int rowcount = shet.getLastRowNum();
		short colcount = shet.getRow(49).getLastCellNum();
		System.out.println("Rowcount:- "+rowcount +  "ColoumCount:- "+colcount);
		for(int i=49;i<=rowcount;i++)
		{
			Row celldata = shet.getRow(i);
			String testScenario = celldata.getCell(2).getStringCellValue();
			String precondition = celldata.getCell(3).getStringCellValue();
			
			System.out.println("Test Scenario :-"+testScenario);
			System.out.println("Pre Condition :-"+precondition);
		}
		
	}
	
	

}
