package Excel;	

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write {

	public static void main(String[] args) throws Throwable
	{
		String file="C:\\Users\\Babul\\Desktop\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(file);
		Workbook kk=WorkbookFactory.create(fis);
		Sheet kkk=kk.getSheet("sheet1");
		Row kkkk=kkk.getRow(2);
		Cell cel=kkkk.createCell(6);
		cel.setCellValue("GRS at jspur191");
		FileOutputStream f1=new FileOutputStream(file);
	   kk.write(f1);
		kk.close();
	}
}

