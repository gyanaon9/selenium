package Vanu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alertt {
	WebDriver d;
	
	public boolean isAlertPresent(){
		try{
			d.switchTo().alert();
			
    //_____________________________________	
			Alert b=d.switchTo().alert();
			String data=b.getText();
			System.out.println(data);
  //______________________________________________
			return true;
		}catch(Exception e){
			return false;
		}
	}
	@Test
	public void D(){
		d=new FirefoxDriver();
	//__________________________________________
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		d.findElement(By.id("loginbutton")).click();
		isAlertPresent();
		
		
		
	}
}
