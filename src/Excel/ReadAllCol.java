package Excel;
	

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadAllCol {

	public static void main(String[] args) throws Throwable 
	{
//open workbook in read mode&create cell & cell data
		String filepath="C:\\Users\\Babul\\Desktop\\Book1.xlsx";
        FileInputStream fis=new FileInputStream(filepath);
        Workbook wb=WorkbookFactory.create(fis);
        Sheet sh=wb.getSheet("Sheet1");
        //get maximum used row colum from "Sheet1"
        int rowcount=sh.getLastRowNum();
        for(int i=1;i<=rowcount;i++)
        {
        	Row row=sh.getRow(i);
        	String data0col=row.getCell(0).getStringCellValue();
        	String data1col=row.getCell(1).getStringCellValue();
        	System.out.println(data0col+"\t"+data1col);
      
        }
	}
}



