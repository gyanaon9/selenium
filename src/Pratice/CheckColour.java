package Pratice;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class CheckColour {
		
		public static void main(String[] args)
		{
			WebDriver d=new FirefoxDriver();
			d.get("https://xnxx.com/");
			d.get("https://facebook.com/");
			d.get("http://flipkart.com/");
			
			d.findElement(By.xpath("//a[text()='Log In']")).click();
			//d.findElement(By.xpath("//*[@autocomplete='on']/div[1]/input")).sendKeys("Gy");
			String color = d.findElement(By.xpath("//a[text()='Log In']")).getCssValue("color");

			 String backcolor = d.findElement(By.xpath("//a[text()='Log In']")).getCssValue("background-color");

			 System.out.println(color);

			 System.out.println(backcolor);
			
		}
		
	}

