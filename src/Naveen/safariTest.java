package Naveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safariTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\testData\\SafariDriver.exe");
		WebDriver d=new SafariDriver();
		
		d.get("https://www.google.co.in/");
		System.out.println(d.getTitle());
		
	}

}
