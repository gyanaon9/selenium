package Excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NewRead {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream d=new FileInputStream("C:\\Users\\Babul\\Desktop\\grsss.xlsx");
		Workbook  k=WorkbookFactory.create(d);
		Sheet k1=k.getSheet("sheet1");
		Row k2=k1.getRow(3);
		String data=k2.getCell(1).getStringCellValue();
		System.out.println(data);



	}

}
