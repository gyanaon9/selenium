package Mvideo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrokenLink {

	@Test
	public void m(){

		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.xnxx.com/");

		List<WebElement>lk=d.findElements(By.tagName("a"));
		System.out.println("total link = "+lk.size());

		for(int i=0;i<=lk.size();i++)
		{
			String url=lk.get(i).getAttribute("href");
			verifyLinkActive(url);
		}

	}
	public static void verifyLinkActive( String Linkurl)
	{


		try
		{
			URL url=new URL( Linkurl);
			HttpURLConnection httpURL=(HttpURLConnection)url.openConnection();
			httpURL.setConnectTimeout(3000);
			httpURL.connect();
			if(httpURL.getResponseCode()==200)
			{
				System.out.println(Linkurl+"___"+httpURL.getResponseMessage());
			}
			if(httpURL.getResponseCode()==404)
			{
				System.out.println(Linkurl+"----"+httpURL.getResponseMessage()+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}
		catch(Exception e){

		}
	}
}
