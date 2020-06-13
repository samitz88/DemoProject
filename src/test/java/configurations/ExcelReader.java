package configurations;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static XSSFSheet excelWSheet;
	private static XSSFWorkbook excelWBook;
	private static XSSFCell Cell;
	String[][] data = null;

public Object[][] getDataObjectArray(String FilePath, String SheetName) {   
   
   try {
	   FileInputStream inputStream = new FileInputStream(FilePath);
	   // Access the required test data sheet

	   excelWBook = new XSSFWorkbook(inputStream);
	   excelWSheet = excelWBook.getSheet(SheetName);
	   int startRow = 1;
	   int startCol = 0;
	   

	   int totalRows = excelWSheet.getLastRowNum();
	   int totalCols = excelWSheet.getRow(0).getLastCellNum();
	   data=new String[totalRows][totalCols];
	  
	   
	   for (int i=startRow;i<=totalRows;i++) {           	   
		  
		   for (int j=startCol;j<totalCols;j++){
			   Cell = excelWSheet.getRow(i).getCell(j);
			   data[i-1][j]=Cell.getStringCellValue();  
			}
		}
	}catch (FileNotFoundException e){
		System.out.println("Could not read the Excel sheet");
		e.printStackTrace();
	}catch (IOException e){
		System.out.println("Could not read the Excel sheet");
		e.printStackTrace();
	}

	return(data);

	}

}
