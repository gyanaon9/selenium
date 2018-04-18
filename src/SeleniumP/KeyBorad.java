package SeleniumP;
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;


	public class KeyBorad {

		public static void main(String[] args) 
		{
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
			WebElement useri=d.findElement(By.id("txtUsername"));
					useri.sendKeys("system");
			Actions act=new Actions(d);
			act.doubleClick(useri).perform();
			act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();
			

		}

}
