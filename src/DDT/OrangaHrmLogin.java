package DDT;
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class OrangaHrmLogin {
		
	
	    @Test(dataProvider="OrangeHrmData")
		public void m(String username, String password) throws Throwable 
	 {
	    	
			WebDriver d = new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
			d.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);
			d.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
			d.findElement(By.id("btnLogin")).click();
		
	          Thread.sleep(2000);
		  System.out.println(d.getTitle());
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
