package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Multiple_Exceldata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream	fs=new FileInputStream("F:\\\\Manual Assignment_TC.xlsx");
		Workbook book = WorkbookFactory.create(fs);
		Sheet sh = book.getSheet("Functional Testing");
		for(int i=50;i<=sh.getLastRowNum();i++)
		{
			String va = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(va);
		}
		
	}
	
	
	
}
