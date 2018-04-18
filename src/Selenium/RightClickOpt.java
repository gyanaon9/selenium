package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClickOpt
{

	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		d.get("http:/www.filpkart.com");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement wb=d.findElement(By.linkText("Track Order"));
	    Actions act=new Actions( d);
	    act.contextClick(wb).perform();
	    act.sendKeys("G").perform();


	}
}
