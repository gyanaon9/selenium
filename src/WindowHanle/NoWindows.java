package WindowHanle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoWindows {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.irctc.co.in/");
		d.findElement(By.xpath("//*[@id='bluemenu']/ul/li[2]/a/img")).click();
		d.findElement(By.xpath("//*[text()='Cab / Bus']")).click();
		
		
		Set<String> wd = d.getWindowHandles();
		System.out.println(wd.size());
		Iterator<String> wdd = wd.iterator();
		String parent = wdd.next();
		System.out.println(parent);
		String child = wdd.next();
		System.out.println(child);
		d.switchTo().window(child);
		d.findElement(By.xpath("//*[text()='Flights']")).click();
		Set<String> wt = d.getWindowHandles();
		System.out.println(wt.size());
		Iterator<String> it = wt.iterator();
		String parenti = it.next();
		System.out.println(parenti);
		String childi = it.next();
		System.out.println(childi);
		String childii = it.next();
		System.out.println(childii);
		d.switchTo().window(childii);
		d.findElement(By.xpath("//*[@id='navrightst']/div/ul/li[1]/a/img")).click();
		Set<String> wo = d.getWindowHandles();
		System.out.println(wo.size());

	}

}
