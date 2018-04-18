package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framehandling {

	
		public static void main(String[] args)
		{
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("http://www.seleniumhq.github.in/");
			d.switchTo().frame(1);
			d.findElement(By.xpath("//span[text()='Github']")).click();
			
		}
}
