package DDT;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Nukri {

	@Test 
	public void m() throws Throwable{

		
		//System.setProperty("webdriver.chrome.driver", ".\\Test-data\\chromedriver.exe");
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.naukri.com/");
		d.manage().window().maximize();
		System.out.println(d.getWindowHandles());
		d.findElement(By.xpath("//*[@id='login_Layer']/div")).click();
		
       d.findElement(By.xpath("//*[@name='email']")).sendKeys("Gyanaon9@gmail.com");
        d.findElement(By.xpath("//*[@id='pLogin']")).sendKeys("grs@@@86");
        d.findElement(By.xpath("//*[@value='Login']")).click();
        Thread.sleep(2000);
        Set<String> wd1 = d.getWindowHandles();
		System.out.println(wd1.size());
       //d.findElement(By.xpath("//*[@class='mTxt']")).click();
        System.out.println(d.getWindowHandles());
        WebElement ele=d.findElement(By.xpath("//div[text()='My Naukri']"));
        WebElement Element1=d.findElement(By.xpath("//*[@class='headGNBWrap']/div/ul[2]/li[2]/a/following-sibling::div[1]/ul/li[1]/a"));
        Actions act=new Actions(d);
        act.moveToElement(ele).perform();
        Element1.click();
        System.out.println("Click on MY_Nukri");
        Thread.sleep(2000);
        
        
        
    	Set<String> wd = d.getWindowHandles();
		System.out.println(wd.size());
		Iterator<String> wdd = wd.iterator();
		String parent = wdd.next();
		System.out.println(parent);
		String child = wdd.next();
		System.out.println(child);
		d.switchTo().window(child);
		
		   // Perform the click operation that opens new window
	       JavascriptExecutor js = (JavascriptExecutor) d;
	       js.executeScript("window.scrollBy(0,1000)");

        d.findElement(By.xpath("//button[@type='submit']")).click();
	}

	

}
