package DDT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
//how to data parameter through testng.xml file to a test case?
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",".\\Test-data\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		

	}
	@Test
	public void myTest(){
		driver.get("https://www.facebook.com/");

}
}