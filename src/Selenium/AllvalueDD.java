package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AllvalueDD {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
//select the dynamic webelement
		WebElement wb=d.findElement(By.id("day"));
//Create  object for select_class 
		Select sel=new Select(wb);
//Capture all the values from DD
		List<WebElement>s=sel.getOptions();
		System.out.println(s.size());
//Display option_name
		for(int i=0;i<s.size();i++)
		{
			String g=s.get(i).getText();
			System.out.println(g);
		
		}
	

}
}