package Mvideo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperMain {
	
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
		
		WebElement username=d.findElement(By.id("email"));
		Helper.highLightElement(d, username);
		username.sendKeys("gyanaranjan.grs9@gmail.com");
		
		WebElement psw=d.findElement(By.id("pass"));
		Helper.highLightElement(d, psw);
		psw.sendKeys("056789");
	}
}
