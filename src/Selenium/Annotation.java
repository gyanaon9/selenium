package Selenium;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation
{
	@Test
	
		public void Sample()
		{
		System.out.println("Syso1T");
	}
	@BeforeMethod
	public void sample1()
	{
		System.out.println("s2BM");
	}
@AfterMethod
public void Sample2()
{
	System.out.println("SSSSS3AM");
}
@BeforeClass
public void Samp()
{
	System.out.println("SSSSSSSssssss589BC");
}
@AfterClass
public void Sam()
{
	System.out.println("AC");
}
@BeforeClass
public void Samp1()
{
	System.out.println("SSdfBC");
}
@AfterSuite
public void Run()
{
	System.out.println("AS");
}
@BeforeSuite
public void Runk()
{
	System.out.println("BS");
}
@AfterGroups
public void RunkU()
{
	System.out.println("143");
}


}
