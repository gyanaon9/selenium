package Selenium;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FilpkartAddITEMs
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://www.flipkart.com/");
		//d.manage().window().maximize();
		d.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("IPHONE",Keys.ENTER);
		//d.findElement(By.xpath("//*[text()='Apple iPhone 6 (Gold, 32 GB)']")).click();
		d.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/a/div[3]/div[1]/div[1]")).click();
		Set<String>wd=d.getWindowHandles();
		System.out.println(wd.size());
		Iterator<String>wdd=wd.iterator();
		String par=wdd.next();
		System.out.println(par);
		String parr=wdd.next();
		System.out.println(parr);
		d.switchTo().window(parr);
		Thread.sleep(2000);
		
		
		
		String x=d.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div[1]/div/div[1]")).getText();
	System.out.println(x);
	}
}


