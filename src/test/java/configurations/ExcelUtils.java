package configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	// Identify Testcases coloum by scanning the entire 1st row
	// once coloumn is identified then scan entire testcase coloum to identify
	// purcjhase testcase row
	// after you grab purchase testcase row = pull all the data of that row and feed
	// into testprivate static XSSFSheet excelWSheet;
	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelWSheet;
	private static XSSFCell cell;
	ArrayList<ArrayList<Object>> a;
	Object[][] objectArray;

	public Object[][] getData(String testCaseName, String path) {
		try {
		a = new ArrayList<ArrayList<Object>>();
		FileInputStream fis = new FileInputStream(path);
		excelWBook = new XSSFWorkbook(fis);
		int testColumn = 0, index = 0;

		int sheetCount = excelWBook.getNumberOfSheets();
		for (int i = 0; i < sheetCount; i++) {
			if (excelWBook.getSheetName(i).equalsIgnoreCase("testdata"))
				excelWSheet = excelWBook.getSheetAt(i);
		}
		int totalRows = excelWSheet.getLastRowNum();
		int totalCols = excelWSheet.getRow(0).getLastCellNum();
		// System.out.println(excelWSheet.getRow(0).getCell(0).getStringCellValue());
		int k = 0;
		while (k < totalCols) {
			if (excelWSheet.getRow(0).getCell(k) == null)
				k++;
			else if (excelWSheet.getRow(0).getCell(k).getStringCellValue().equalsIgnoreCase("TestCases")) {
				testColumn = k;
				break;
			}
		}

		for (int i = 1; i <=totalRows; i++) {
			if (excelWSheet.getRow(i).getCell(testColumn).getStringCellValue().equalsIgnoreCase(testCaseName)) {
				for (int j = testColumn; j < totalCols - 1; j++) {
					cell = excelWSheet.getRow(i).getCell(j + 1);
					// System.out.println(cell);
					a.add(new ArrayList<Object>());
					if (cell == null)
						a.get(index).add("");
					else if (cell.getCellType() == CellType.NUMERIC) {
						if (DateUtil.isCellDateFormatted(cell)) {
							SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
							String convertedCurrentDate = sdf.format(cell.getDateCellValue());
							a.get(index).add(convertedCurrentDate);
						} else
							a.get(index).add(NumberToTextConverter.toText(cell.getNumericCellValue()));
					} else if (cell.getCellType() == CellType.STRING)
						a.get(index).add(cell.getStringCellValue());
					else if (cell.getCellType() == CellType.BOOLEAN)
						a.get(index).add(cell.getBooleanCellValue());

				}
				if (excelWSheet.getRow(i + 1) == null)
					break;
				else if (excelWSheet.getRow(i + 1).getCell(testColumn).getStringCellValue()
						.equalsIgnoreCase(testCaseName))
					index++;
				else  {
					break;

				}
			}

		}
		int colCount = a.get(0).size();
		int rowCount = a.size() / colCount;

		objectArray = new Object[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				objectArray[i][j] = a.get(i).get(j);
			}
		}
		}catch (FileNotFoundException e){
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}catch (IOException e){
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		return objectArray;
	}

	/*
	 * public static void main(String[] args) throws IOException, ParseException {
	 * 
	 * ExcelUtils excelUtils = new ExcelUtils(); String path =
	 * "C:\\Users\\samit\\work\\Testdata.xlsx"; Object[][] arrayList =
	 * excelUtils.getData("TC001", path); for (int i = 0; i <3; i++) { for (int j =
	 * 0; j <2; j++) System.out.println(arrayList[i][j]); System.out.println(); } }
	 */

}
