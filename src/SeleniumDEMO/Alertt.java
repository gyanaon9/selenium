package SeleniumDEMO;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

	public class Alertt {
	
			@Test
			public void m()
			{
				WebDriver d=new FirefoxDriver();
				d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
				d.findElement(By.xpath("//*[@id='loginbutton']")).click();
			Alert b=d.switchTo().alert();
			String u=b.getText();
			Assert.assertEquals(u, "Enter User ID");
			System.out.println("S");
			}
	}

