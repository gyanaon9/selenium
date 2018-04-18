package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng 
{
	//variable & object declaration
	//int i;
	WebDriver d;
	@BeforeClass
	public void configBeforclass()
	{
		System.out.println("=====Lunch brower");
		//i=10;
		d=new FirefoxDriver();
	}
	@BeforeMethod
	public void configurMethod()
	{
		System.out.println("login");
	}
	@Test
	public void createcustomer()
	{
		System.out.println("Create");
	}
	@Test
	public void modifycustomer()
	{
		System.out.println("modify");	
	}
	@AfterMethod
	public void Configurationm()
	{
		System.out.println("logout");
	}
	@AfterClass
	public  void configuration()
	{
		System.out.println("Exit");
	}
		@AfterTest
		public void mkl()
		{
		System.out.println("KKKKKKKKKKKK");
	}

}
