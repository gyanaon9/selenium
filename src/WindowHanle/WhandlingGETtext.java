package WindowHanle;

	import java.util.Iterator;
	import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class WhandlingGETtext{
		
		public static void main(String[] args) throws Exception 
		{
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("https://www.irctc.co.in/");
			d.findElement(By.xpath("//*[@id='bluemenu']/ul/li[2]/a/img")).click();
			d.findElement(By.xpath("//*[text()='Cab / Bus']")).click();
			Set<String>wd=d.getWindowHandles();
			System.out.println(wd.size());
		Iterator<String>wdd=wd.iterator();
		String parent=wdd.next();
		System.out.println(parent);
		String child=wdd.next();
		System.out.println(child);
		d.switchTo().window(child);
		d.findElement(By.xpath("//*[text()='Tourist Trains']")).click();
				d.findElement(By.xpath("//*[@id='mainpannelNewLook']/div/div/ul/li[5]/div/div/span/a[2]")).click();
		
				
	       String x=d.findElement(By.xpath("//*[text()='Fare Details']")).getText();
	        System.out.println(x);
	        
		}

	}

