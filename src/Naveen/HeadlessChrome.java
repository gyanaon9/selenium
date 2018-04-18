package Naveen;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadlessChrome {
	
	public static void main(String[] args ) throws Throwable 
	{
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Test-data\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		//Lunch Browser
		       WebDriver d=new ChromeDriver(options);

			//Dynamic wait
			d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	
		d.get("https://www.freecrm.com/");
		System.out.println("LoginpageTittle---"+d.getTitle());
		
		d.findElement(By.name("username")).sendKeys("naveenk");
		d.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("HomePageTittle---"+d.getTitle());
	
		
	}
		

}
