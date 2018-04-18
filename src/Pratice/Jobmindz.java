package Pratice;
	
	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jobmindz
{
	public static void main(String[] args) 
	{
	WebDriver d=new FirefoxDriver();
	d.get("https://www.jobmindz.com/");
	d.findElement(By.xpath("//*[@class='fa fa-sign-in']/..")).click();
	d.findElement(By.className("form-control")).sendKeys("GYANA");
	d.findElement(By.name("e_pass")).sendKeys("123456");

	}

}


