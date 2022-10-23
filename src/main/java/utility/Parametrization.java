package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String getaxleData(int row,int cell,String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\91976\\eclipse-workspace\\nopcommerse\\src\\main\\resources\\Data.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;

	}

}
