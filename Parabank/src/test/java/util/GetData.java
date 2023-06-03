package util;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class GetData {
	
	public Object[][] read_excel_sheet1() throws InvalidFormatException, IOException{
		// create instance of File class and XSSFworkbook class
			File myfile=new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
					+ "resources" + File.separator + "data" + File.separator + "invalid login data.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(myfile);
		//identify required sheet
			XSSFSheet mysheet=wb.getSheet("Sheet1");
		//get number of rows
			int number_of_rows= mysheet.getPhysicalNumberOfRows();
		//get number of columns
			int number_of_columns= mysheet.getRow(0).getLastCellNum();
		//create multidimensional array
			String[][] myarray=new String[number_of_rows-1][number_of_columns];
		//create for loop over rows and inner for loop over columns
			for(int i=1;i<number_of_rows;i++){
				for(int a=0;i<number_of_columns;a++){
		//define row number with the variable in for loop
					XSSFRow row=mysheet.getRow(i);
		//define cell 
					myarray[i-1][a]=row.getCell(a).getStringCellValue();
		}}
			return  myarray;
		}
}
