package Mvideo;

import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	
	public class ScollDown {
		
		@Test
		public void scoll() throws Throwable
		{
			WebDriver d=new FirefoxDriver();
			d.manage().window().maximize();
			d.get("http://jqueryui.com");
			Thread.sleep(5000);
			
			((JavascriptExecutor)d).executeScript("scroll(0,2000)");
		}

	}

	   // Perform the actions on new window

 
 