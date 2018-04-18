package Excel;	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScreenShot {

	@Test
	public  void TakeScreenShotWebDriver()
	{
		WebDriver d=new FirefoxDriver();
		d.get("https//flipkart.com/");
		EventFiringWebDriver ed=new EventFiringWebDriver(d);
		
		
		
	}
}

