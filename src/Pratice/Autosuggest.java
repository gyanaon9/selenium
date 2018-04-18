package Pratice;
	
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Autosuggest {

		public static void main(String[] args) 
		{
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("https://google.com");

		    d.findElement(By.className("gsfi")).sendKeys("cricbuzz");	
	      List<WebElement>y=d.findElements(By.xpath("//a"));
	      for(int i=0;i<y.size();i++)
	      {
	    	  String data=y.get(i).getText();
	    	  System.out.println(data);
	      }
		}

	}
