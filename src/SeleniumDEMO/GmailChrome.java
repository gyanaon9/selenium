package SeleniumDEMO;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailChrome {
	
	@Test
	public void Ram() throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", ".\\Test-data\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http:/www.gmail.com/");
		d.findElement(By.id("identifierId")).sendKeys("gyanaranjan.grs9@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		d.findElement(By.name("password")).sendKeys("grs@@@00");
		Thread.sleep(500);
		d.findElement(By.xpath("//span[text()='Next']")).click();
		
		//logout
	   	d.findElement(By.xpath("//*[@id='gbwa']/../div[4]/div[1]/a")).click();
		d.findElement(By.xpath("//*[text()='Sign out']")).click();

	}

}
