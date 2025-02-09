package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonIntegrationExcel {

	public static String[][] readData (String excelFileName) throws IOException {
		//locate the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		//locate the worksheet
		XSSFSheet ws = wb.getSheetAt(0);
		//locate my row
		/*
		 * XSSFRow row = ws.getRow(1);
		 * 
		 * System.out.println(row);
		 * 
		 * XSSFCell cell = row.getCell(0); System.out.println(cell);
		 */
		/*
		 * int totalRows = ws.getPhysicalNumberOfRows();
		 * System.out.println("totalrows:"+totalRows);
		 */
		
		/*
		 * String stringCellValue = ws.getRow(1).getCell(0).getStringCellValue();
		 * System.out.println(stringCellValue);
		 */
		//rowcount
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		//columncount
		int columnCount = ws.getRow(1).getLastCellNum();
		System.out.println(columnCount);
		
		//entire row
		/*
		 * for (int i = 1;i<=rowCount ; i++) { System.out.println(ws.getRow(i));
		 * 
		 * }
		 */
		
		String [][] data=new String[rowCount][columnCount];
		//entire data
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(stringCellValue2);
				
				data[i-1][j]=stringCellValue2;
				
			}
		}
		wb.close();
		return data;

	}

}
