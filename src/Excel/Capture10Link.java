package Excel;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.util.List;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Capture10Link {
		@Test
		public void CaptureLinkFrom() throws Throwable {
			System.setProperty("webdriver.chrome.driver",".\\testData\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://www.indiabookstore.net/");

			List<WebElement> wbb = d.findElements(By.xpath("//*[@class='categoryBookTitle']"));
			int no = wbb.size();
			String combinedString = "";
			for (int i = 0; i < no; i++)
			{
				String AllLink = wbb.get(i).getText();

				combinedString = combinedString + AllLink + " , ";

				
			}
			String filepath ="./resource/CaptureAllLink.xlsx";
			FileInputStream fi = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fi);
			Sheet sh = wb.createSheet("Gyana");
			Row rw = sh.createRow(2);
			Cell cl = rw.createCell(5);
			cl.setCellValue(combinedString);

			FileOutputStream fo = new FileOutputStream(filepath);
			wb.write(fo);
		}

}
