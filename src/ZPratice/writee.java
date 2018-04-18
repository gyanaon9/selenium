package ZPratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writee {
	
	public static void main(String[] args) throws Throwable {
		
		String x="C\\asf.xlsx";
		FileInputStream fi=new FileInputStream(x);
		Workbook wk=WorkbookFactory.create(fi);
             Sheet sh=wk.getSheet("sheet1");
             Row rw=sh.getRow(1);
             Cell cl=rw.createCell(6);
             cl.setCellValue("GrSAtjspu");
             FileOutputStream fo=new FileOutputStream(x);
             wk.write(fo);
             wk.close();
             
             
	}

}
