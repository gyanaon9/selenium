package ZPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cr {

	WebDriver d;
	@Parameters("browser")
	@BeforeClass
	public void m(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")){
			d=new FirefoxDriver();
		}
		else
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", ".//test-data/chromedriver.exe");
				d=new ChromeDriver();

			}
	}
	@Test
	public void Mytest(){
	}
}

