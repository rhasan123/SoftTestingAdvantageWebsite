package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData {

	public static XSSFWorkbook workbook;
	public static XSSFSheet worksheet;
	public static XSSFCell cell;

   public static int[] readExcelData(String sPath, String sheetname) throws IOException
	
	{
		//
		FileInputStream fis = new FileInputStream(sPath);
		
		workbook = new XSSFWorkbook(fis);
		
		worksheet=workbook.getSheet(sheetname);
	
//  
	Iterator<Row> rowIterator = worksheet.iterator();
	int icol = 0;
	First: 
		while (rowIterator.hasNext()) {
		int col = 0;
		Row row = rowIterator.next();
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			col++;
			Cell cell1 = cellIterator.next();
			if (cell1.getStringCellValue().equalsIgnoreCase("Keywords")) 
			{
				icol = col-1;
				break First;
			}
			
		}
		
	}
		int[] loc = new int[2];
		loc[0]=icol;
		loc[1]= worksheet.getLastRowNum();
		
		
		return loc;
	}
	
		
 public static  String readCellData(int rowNum, int colNum)	
		{			cell=worksheet.getRow(rowNum).getCell(colNum);
			
			String readcellValue=cell.getStringCellValue();
			return readcellValue;
		}
	}

