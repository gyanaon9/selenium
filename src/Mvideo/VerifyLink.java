package Mvideo;

import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class VerifyLink {
		
		public static void main(String[] args) {
			
			WebDriver d=new  FirefoxDriver();
			d.get("http://google.com/");
			
			List<WebElement>links=d.findElements(By.tagName("a"));
			System.out.println("Total link="+links.size());
			
			
				
		}
}
