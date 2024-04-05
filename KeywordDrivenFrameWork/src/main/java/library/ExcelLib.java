package library;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {

	public static File file= new File("./src/test/resources/TestData/ExcelData.xlsx");
	public static String Locators(int rowNumber) throws EncryptedDocumentException, IOException {
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheet("data");
		return sheet.getRow(rowNumber).getCell(3).toString();
	}
	
	public static String actions(int rowNumber) throws EncryptedDocumentException, IOException {
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheet("data");
		return sheet.getRow(rowNumber).getCell(2).toString();
	}
	
	public static String testData(int rowNumber) throws EncryptedDocumentException, IOException {
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheet("data");
		return sheet.getRow(rowNumber).getCell(1).toString();
	}
	
	
	
}
