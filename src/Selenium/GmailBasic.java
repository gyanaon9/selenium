package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailBasic {

	public static void main(String[] args) {

		//......................................................
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();

		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//d.get("http://www.google.com/");
          d.navigate().to("http://www.google.com/");
		//Another method to call URL
		d.navigate().to("http://www.gmail.com/");
		String pageTittle=d.getTitle();
		System.out.println(pageTittle);
		String URL=d.getCurrentUrl();
		System.out.println(URL);
		//html page of current url
		String s=d.getPageSource();
		System.out.println(s);
		d.close();
	}

}
