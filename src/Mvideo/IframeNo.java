package Mvideo;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class IframeNo {
		
		@Test
		public void m()
		{
			WebDriver d=new FirefoxDriver();
			d.get("http://www.guru99.com/");
			List<WebElement>at=d.findElements(By.tagName("iframe"));
			System.out.println("total frame="+ at.size());
			
		}

	}



