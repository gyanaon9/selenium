package Excel;
	
	import java.io.FileInputStream;

	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Read2N3col {
	
		public static void main(String[] args) throws Throwable 
		{
			FileInputStream d=new FileInputStream("C:\\Users\\Babul\\Desktop\\Book1.xlsx");
	        Workbook k=WorkbookFactory.create(d);
	        Sheet k1=k.getSheet("Sheet1");
	        Row k2=k1.getRow(3);
	        String data=k2.getCell(2).getStringCellValue();
	        System.out.println(data);
	        String data1=k2.getCell(3).getStringCellValue();
	        System.out.println(data1);
	        
		}
	}


