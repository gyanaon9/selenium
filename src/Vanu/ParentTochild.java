package Vanu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentTochild {
	
	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.irctc.co.in/");
		d.findElement(By.xpath("//*[@id='bluemenu']/ul/li[2]/a/img")).click();
		d.findElement(By.xpath("//*[text()='Cab']")).click();
		Set<String>wd=d.getWindowHandles();
		System.out.println(wd.size());
	Iterator<String>wdd=wd.iterator();
    ArrayList<String>al=new ArrayList<String>();
    while(wdd.hasNext());
    {
    	al.add(wdd.next());
    }
    
    d.switchTo().window(al.get(1));
    
    

}
}
