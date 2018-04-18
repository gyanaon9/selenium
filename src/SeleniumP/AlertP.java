package SeleniumP;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class AlertP
	{
		public static void main(String[] args) 
		{
			WebDriver d=new FirefoxDriver();
			d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			d.findElement(By.id("loginbutton")).click();
			Alert b=d.switchTo().alert();
			String data=b.getText();
			System.out.println(data);

		}

	}



