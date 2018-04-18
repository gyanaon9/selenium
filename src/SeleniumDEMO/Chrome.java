package SeleniumDEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	
	@Test
	public void Ram()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Test-data\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://in.yahoo.com/");	
	}
}
