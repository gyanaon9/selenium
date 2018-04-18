package ZPratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {
	
	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://www.facebook.com/");
		
		WebElement wb=d.findElement(By.id("year"));
	     Select sel=new Select(wb);	
	     List<WebElement>ls=sel.getOptions();
	     System.out.println(ls.size());
	     
	     for(int i=0;i<ls.size();i++)
	     {
	    	 String data=ls.get(i).getText();
	    	 
	    	 System.out.println(data);
	     }
	     
	     
	     
	}

}
