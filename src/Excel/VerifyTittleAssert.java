package Excel;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class VerifyTittleAssert {
		@Test
		public void verifytille()
		{
			WebDriver d=new FirefoxDriver();
			d.get("http://learn-automation.com/");
			String X=d.getTitle();
			System.out.println(X);
		//-------------------------------------------------------------------------	
			//Actual_title
			String myTittle=d.getTitle();
			System.out.println("This-------"+myTittle);
			String Exp="Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
			Assert.assertEquals(myTittle, Exp);
			System.out.println("GRS");
		}
}
