package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NukriMore {

	WebDriver d;
	String url;
	@BeforeMethod
	public void Lunchbrower()
	{
		d=new FirefoxDriver();
		url="https://www.naukri.com/";
	}
	@Test
	public  void aTest() throws Throwable
	{
		d.get(url);

		Thread.sleep(2000);
		Actions act=new Actions(d);
		act.moveToElement(d.findElement(By.xpath("//div[text()='More']")));
		act.build().perform();
		System.out.println("Click more");
		Thread.sleep(2000);
		//click on MCA
		d.findElement(By.xpath("//a[@title='MCA']")).click();
		System.out.println("Click MCA");
	}

}
