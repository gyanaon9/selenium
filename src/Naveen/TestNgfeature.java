package Naveen;

import org.testng.annotations.Test;

public class TestNgfeature {
	
	@Test
	public void LoginPage()
	{
		int i=9/0;
		System.out.println("login data");
	}
	@Test(dependsOnMethods="LoginPage")
	public void HomePage()
	{
		System.out.println("Home Page");
	}
	@Test(dependsOnMethods="LoginPage")
	public void SearchPage()
	{
		System.out.println("Login page");
	}
	@Test(dependsOnMethods="LoginPage")
	public void ReportPage()
	{
		System.out.println("Report data");
	}
	
	
	
	
	
	

}
