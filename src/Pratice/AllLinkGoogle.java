package Pratice;
	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


public class AllLinkGoogle {

		public static void main(String[] args) throws Throwable
		{
			System.setProperty("webdriver.chrome.driver",".\\Test-data\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https:google.com//");
			//................
			d.findElement(By.className("gsfi")).click();
			d.findElement(By.className("gsfi")).sendKeys("cricbuzz");
		        d.findElement(By.xpath(".//*[@id='sb_ifc0']")).click();
			//.................
			List<WebElement>wb=d.findElements(By.xpath("//a"));
			System.out.println(wb.size());
	       for(int i=0;i<wb.size();i++)
	       {
	    	   String data=wb.get(i).getText();
	    	   System.out.println(data);
		}
			

	}

	}

