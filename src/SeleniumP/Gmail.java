package SeleniumP;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http:/www.gmail.com/");
		d.findElement(By.id("identifierId")).sendKeys("gyanaranjan.grs9@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		d.findElement(By.name("password")).sendKeys("grs@@@11");
		Thread.sleep(500);
		d.findElement(By.xpath("//span[text()='Next']")).click();
		
		//logout
	   	d.findElement(By.xpath("//*[@class='gb_bb gbii']")).click();
		d.findElement(By.xpath("//*[text()='Sign out']")).click();
		//capture unread msg
		//d.findElement(By.xpath(".//div[@class='pH a9q']"));
		Runtime.getRuntime().exec("shutdown -s -t00");
	}

}





