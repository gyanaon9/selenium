package SeleniumDEMO;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void verifyInvalidMsg()
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
	
		String ExpMsg="username & password cannot be empty";
		d.findElement(By.id("btnLogin")).click();
		
		String ActMsg=d.findElement(By.id("spanMessage")).getText();
	   
		Assert.assertEquals("ActMsg, ExpMsg","invalid message is not verify=fail");
		System.out.println("88888");
	}

}

