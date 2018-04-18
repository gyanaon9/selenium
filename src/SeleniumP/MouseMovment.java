package SeleniumP;
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class MouseMovment {

		public static void main(String[] args) 
		{
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("https://www.flipkart.com/");
			WebElement wb=d.findElement(By.xpath("//*[text()='Electronics']"));
			Actions act=new Actions(d);
			act.moveToElement(wb).perform();
			//WebElement wb1=d.findElement(By.xpath("//*[text()='Mobile Cases']"));
			//act.moveToElement(wb1).perform();

		}

	}

