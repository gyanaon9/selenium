package Naveen;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkTest {
	
	public static void main(String[] args ) throws Throwable 
	{
		
		//System.setProperty("webdriver.chrome.driver", ".\\Test-data\\chromedriver.exe");
		//Lunch Browser
		//WebDriver d=new ChromeDriver();
			WebDriver d=new FirefoxDriver();
			d.manage().window().maximize();
			//Delete all cookies
			
			d.manage().deleteAllCookies();
			//Dynamic wait
			d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	
		d.get("https://www.freecrm.com/");
		d.findElement(By.name("username")).sendKeys("naveenk");
		d.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@type='submit']")).click();
		d.switchTo().frame("mainpanel");
		
		//links...//a
		//image.//img
		
		List<WebElement>ls=d.findElements(By.tagName("a"));
		ls.addAll(d.findElements(By.tagName("img")));
		List<WebElement>ActiveL=new ArrayList<WebElement>();
		//Size of all link
		System.out.println(ls.size());
		
		//iterate
		for(int i=0; i<ls.size();i++){
		if(ls.get(i).getAttribute("href") !=null){
			ActiveL.add(ls.get(i));
		}
			
		}
      //get size of activelinkList
		System.out.println(ActiveL.size());
		//200--Ok
		//404--Not found
		//500--Internal Error
		//400--Bad Request
		
		for(int j=0;j<ActiveL.size();j++){
		
	HttpURLConnection connection=(HttpURLConnection)new URL(ActiveL.get(j).getAttribute("href")).openConnection();
	     connection.connect();
	     String response=connection.getRequestMethod();
	     connection.disconnect();
	     System.out.println(ActiveL.get(j).getAttribute("href")+"-------------"+response);
		}
		
	}
}