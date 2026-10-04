package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelfatchclass {

	
		
		public static Object[][] getexceldata() throws IOException {
			
			FileInputStream fiss= new FileInputStream("C:\\Users\\Arti\\OneDrive\\Desktop\\auditdata.xlsx");
			Workbook workbk= new XSSFWorkbook(fiss);
			Sheet shet=workbk.getSheet("Sheet1");
			
			int rows=shet.getLastRowNum();
			int cols=shet.getRow(0).getLastCellNum();
			
			Object[][] data=new Object[rows][cols];
			for(int i=1; i<=rows; i++) {
				for(int j=0; j<cols; j++) {
					try {
			
					data[i-1][j]=shet.getRow(i).getCell(j).toString();
				}catch(NullPointerException e) {
					data[i-1][j]="";
				}
					
				}
					}
			
			workbk.close();
			
			return data;
			
		}
	}


