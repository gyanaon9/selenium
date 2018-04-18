package Selenium;
	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class All {
		@Parameters("browser")
		@Test
		public void AKk()
		{
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("https://yahoo.co.in/");
			List<WebElement> kl=d.findElements(By.xpath("//a[*]"));
			//int p=kl.size();
			//System.out.println(p);
			System.out.println(kl.size());
			for(int i=0;i<kl.size();i++)
			{
				String hj=kl.get(i).getText();
				System.out.println(hj);
			}
		}


}
