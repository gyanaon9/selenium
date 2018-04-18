package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DDindeX {

	public static void main(String[] args) {

		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Find Dynamic webelements
		d.get("https://www.facebook.com/");
		WebElement wb=d.findElement(By.id("day"));
		//Create object select_class 
		Select sel=new Select(wb);
		sel.selectByIndex(2);
		Select sel1=new Select(d.findElement(By.id("year")));
		sel1.selectByVisibleText("1950");

	}

}
