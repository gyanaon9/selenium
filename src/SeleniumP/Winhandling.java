package SeleniumP;
	import java.util.Iterator;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Winhandling {

		public static void main(String[] args) 
		{
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			d.findElement(By.linkText("Cab / Bus")).click();
			Set<String>wd=d.getWindowHandles();
			System.out.println(wd.size());
		Iterator<String>wdd=wd.iterator();
		String parent=wdd.next();
		System.out.println(parent);
		String child=wdd.next();
		System.out.println(child);
		d.switchTo().window(child);
		d.findElement(By.xpath("//*[text()='Tourist Trains']")).click();
	    d.findElement(By.xpath("//*[text()='Buddhist Circuit Tourist Train']/../a"));
		Set<String>wid=d.getWindowHandles();
		System.out.println(wid.size());
		Iterator<String>widd=wid.iterator();
		String parenti=widd.next();
		System.out.println(parenti);
		String childi=widd.next();
		System.out.println(childi);
		String childii=widd.next();
		System.out.println(childii);
	  d.switchTo().window(childii);
	  d.findElement(By.xpath("")).click();
	  //Doubt
	  String x=d.findElement(By.xpath("//*[text()='Chinese Language']")).getText();
	         System.out.println(x);
			
		}

	}
	//String typedText = d.findElement(By.xpath("xpath of box")).getAttribute("value"));


