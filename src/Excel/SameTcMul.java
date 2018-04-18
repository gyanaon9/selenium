package Excel;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class SameTcMul {
		
		@Test(invocationCount=10)
		public void T1()
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.guru99.com/");
			//other Way throw sopln
			//System.out.println("Execute create user");
		}

	}
