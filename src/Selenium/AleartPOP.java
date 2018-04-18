package Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AleartPOP {
	
	@Test 
	public void m(){
		
		WebDriver b=new FirefoxDriver();
	     b.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	     b.findElement(By.id("loginbutton")).click();
	     Alert k=b.switchTo().alert();
	    String data=k.getText();
	    System.out.println(data);
	   Assert.assertEquals( "Enter User ID", data);
	   System.out.println("pass");
		

}
}