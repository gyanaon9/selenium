package Excel;
	

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writee {

	public static void main(String[] args) throws Throwable 
	{
//open workbook in read mode&create cell & cell data
		String filepath="C:\\Users\\Babul\\Desktop\\Book1.xlsx";
        FileInputStream fis=new FileInputStream(filepath);
        Workbook wb=WorkbookFactory.create(fis);
        Sheet sh=wb.getSheet("Sheet1");
        Row row=sh.getRow(1);
        Cell cel=row.createCell(6);
        cel.setCellValue("Pass.GRS");
       FileOutputStream fos=new FileOutputStream(filepath);
       wb.write(fos);
       wb.close();
       
        
	}

}
