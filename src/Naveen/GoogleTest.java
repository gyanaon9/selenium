package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver d;
	@BeforeMethod()
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Test-data\\chromedriver.exe");
		d=new ChromeDriver();
		//d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://google.com/");
		
	}
	@Test
	public void googleTittleTest()
	{
		String t=d.getTitle();
		System.out.println(t);
		Assert.assertEquals(t, "Google1","tittle is not mached");
	}
	@Test
	public void logTest()
	{
		boolean b=d.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
		
	}
	@Test
	public void gmail()
	{
		boolean b=d.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).isDisplayed();
		System.out.println();
	}
   @AfterMethod
   public void Quit()
   {
	   d.close();
   }
}
