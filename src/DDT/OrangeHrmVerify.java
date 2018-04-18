package DDT;
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class OrangeHrmVerify {
		
		
		WebDriver d;
	    @Test(dataProvider="OrangeHrmData")
		public void m(String username, String password) throws Throwable 
	 {
	    	
			 d = new FirefoxDriver();
			//d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
			d.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);
			d.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
			d.findElement(By.id("btnLogin")).click();
		
			//d.findElement(By.xpath("//a[@id='welcome']")).click();
			//d.findElement(By.xpath("//*[text()='Logout']")).click();
			Thread.sleep(2000);
			String WelcomeAdmin=d.findElement(By.xpath("//a[text()='Welcome Admin']")).getText();
			//Assert.assertTrue(d.getTitle().contains("OrangeHRM"),"User not able to login Suceefully");
			//Comparing visible text "Welcome Admin"
			Assert.assertEquals(WelcomeAdmin,"Welcome Admin");
			System.out.println("User able to login succesfully");
		}
	    
	    @AfterMethod
	    public void down()
	    {
	    	d.quit();
	    
	    }
	    
	    
	    @DataProvider(name="OrangeHrmData")
	    public Object[][] passData()
	    {
	    	Object[][] data=new Object[3][2];
	    	data[0][0]="user";
	    	data[0][1]="admin";
	    	data[1][0]="User";
	    	data[1][1]="admin1";
	    	data[2][0]="user";
	    	data[2][1]="admin";
	    	
	    	return data;
	    }
}
