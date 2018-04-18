package SeleniumP;
	import java.io.IOException;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragDrop {

		public static void main(String[] args) 
		{
			WebDriver d=new FirefoxDriver();
			d.get("https://jqueryui.com/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//click on droppable
			d.findElement(By.xpath("//*[text()='Droppable']")).click();
			d.switchTo().frame(0);
			WebElement a=d.findElement(By.id("draggable"));
			WebElement b=d.findElement(By.xpath("//*[@id='droppable']"));
		
			Actions act=new Actions(d);
			act.dragAndDrop(a,b).perform();
			act.click();
		
		}
			

	}

