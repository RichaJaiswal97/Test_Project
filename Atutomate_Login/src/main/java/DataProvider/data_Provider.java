package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class data_Provider extends Assistment_Exam.Loging_Page.initializate_BaseClass{

		static DataFormatter formatter = new DataFormatter();

		@DataProvider(name = "Login")
		public static Object[][] getData() throws IOException {
			FileInputStream xl = new FileInputStream("./src/main/java/DataProvider/File/Data_Provider.xlsx");

			@SuppressWarnings("resource")
			XSSFWorkbook Excel = new XSSFWorkbook(xl);
			XSSFSheet sheetNo = Excel.getSheetAt(0);
			int rowcount = sheetNo.getPhysicalNumberOfRows();// get sheet data
			XSSFRow row = sheetNo.getRow(0);
			int columncount = row.getLastCellNum();
			Object data[][] = new Object[rowcount - 1][columncount];
			for (int i = 0; i < rowcount - 1; i++) {
				row = sheetNo.getRow(i + 1);
				for (int k = 0; k < columncount; k++) {
					XSSFCell cellvalue = row.getCell(k);

					data[i][k] = formatter.formatCellValue(cellvalue);
				}
			}
			return data;
	
		}
	}

