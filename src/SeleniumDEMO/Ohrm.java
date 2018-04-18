package SeleniumDEMO;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ohrm {
	
      @Test()
       public void m(){
		
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		d.findElement(By.id("txtUsername")).sendKeys("user");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.id("btnLogin")).click();
		d.findElement(By.id("welcome")).click();
		d.findElement(By.xpath("//*[text()='Logout']")).click();
		d.close();
		
		
	}

}

