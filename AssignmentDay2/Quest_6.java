/*
Quest.6 Create a program to read from an excel file and print the data .
 */

// Java Program to Illustrate Reading 
// Data to Excel File Using Apache POI 

// Import statements 
import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import org.apache.poi.hssf.usermodel.HSSFSheet; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.FormulaEvaluator; 
import org.apache.poi.ss.usermodel.Row; 

// Main class 
public class Quest_6 { 

	// Main driver method 
	public static void main(String[] args) 
	{ 
		// Try block to check for exceptions 
		try { 
			// Reading file from local directory 
			FileInputStream file = new FileInputStream( 
				new File("newTextfile.txt")); 
			// Create Workbook instance holding reference to 
			// .xlsx file 
			XSSFWorkbook workbook = new XSSFWorkbook(file); 
			// Get first/desired sheet from the workbook 
			XSSFSheet sheet = workbook.getSheetAt(0); 
			// Iterate through each rows one by one 
			Iterator<Row> rowIterator = sheet.iterator(); 
			// Till there is an element condition holds true 
			while (rowIterator.hasNext()) { 
				Row row = rowIterator.next(); 
				// For each row, iterate through all the 
				// columns 
				Iterator<Cell> cellIterator = row.cellIterator(); 

				while (cellIterator.hasNext()) { 
					Cell cell = cellIterator.next(); 
					// Checking the cell type and format 
					// accordingly 
					switch (cell.getCellType()) { 
					// Case 1 
					case Cell.CELL_TYPE_NUMERIC: 
						System.out.print(cell.getNumericCellValue() 
							+ "t"); 
						break; 
					// Case 2 
					case Cell.CELL_TYPE_STRING: 
						System.out.print(cell.getStringCellValue()+ "t"); 
						break; 
					} 
				} 
				System.out.println(""); 
			} 
			// Closing file output streams 
			file.close(); 
		} 

		// Catch block to handle exceptions 
		catch (Exception e) { 
			// Display the exception along with line number 
			// using printStackTrace() method 
			e.printStackTrace(); 
		} 
	} 
}
