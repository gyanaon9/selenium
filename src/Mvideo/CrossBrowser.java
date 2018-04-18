package Mvideo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Test
	//@parameter("browser")
	public void VerifyPageTittle(String BrowsrName)
	{
			if(BrowsrName.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver",".\\Testdata\\chromedriver.exe");
				driver=new ChromeDriver();


			}else if(BrowsrName.equalsIgnoreCase("firefox")){

				driver =new FirefoxDriver();
			}	
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			System.out.println( driver.getTitle());
	}
}

