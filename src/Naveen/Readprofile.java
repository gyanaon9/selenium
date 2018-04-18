package Naveen;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	
	public class Readprofile {
	static WebDriver d;
		
		public static void main(String[] args) throws IOException{
			
			
			Properties p=new Properties();
			FileInputStream fi=new FileInputStream("F:/Mylo/Selenium/src/Naveen/config.pproperties");
			
			p.load(fi);
			
		System.out.println(	p.getProperty("age"));
		System.out.println(	p.getProperty("name"));
		
		String dx=p.getProperty("url");
		System.out.println(dx);
		String broname=p.getProperty("browser");
		System.out.println(broname);
		
	    if(broname.equals("chrome")){
	    	System.setProperty("webdriver.chrome.driver", ".\\Test-data\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
	    }
	    else if(broname.equals("firefox")){
	    	d= new FirefoxDriver();
	    }
	   d.get(dx);
	   d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    d.findElement(By.xpath(p.getProperty("firstname_xpath"))).sendKeys("firstName");

	    
	    d.findElement(By.xpath(p.getProperty("lastname_xpath"))).sendKeys("lastName");
	    
	    d.findElement(By.xpath(p.getProperty("city_xpath"))).sendKeys("city");
		}

	}
	//# used for get output=null----#name=GRs