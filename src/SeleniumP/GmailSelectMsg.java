package SeleniumP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSelectMsg
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http:/www.gmail.com/");
		d.findElement(By.id("identifierId")).sendKeys("sahoogrs@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		d.findElement(By.name("password")).sendKeys("grs@@@00");
		Thread.sleep(500);
		d.findElement(By.xpath("//span[text()='Next']")).click();
		d.findElement(By.xpath("//*[@id=':2w']/div")).click();
		d.findElement(By.xpath("//*[@class='ar9 T-I-J3 J-J5-Ji']")).click();
	}
}


