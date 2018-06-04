package DDT;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class Parameter {
	
	@Parameters("test")
	@Test
	public void m() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\Test-data\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.manage().window().maximize();
		 d.get("https://www.google.co.in/");
		 Thread.sleep(2000);
		 d.quit();
	}
	}

