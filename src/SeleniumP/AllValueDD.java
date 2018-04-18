package SeleniumP;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AllValueDD {

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
	   WebElement wb=d.findElement(By.id("month"));
	   
	    Select sel=new Select(wb);
	    List<WebElement>as=sel.getOptions();
	    System.out.println(as.size());
	    for(int i=0;i<as.size();i++)
	    {
	    	String a=as.get(i).getText();
	    	System.out.println(a);
	    	
	    }

}

}
