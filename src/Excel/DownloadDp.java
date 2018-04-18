package Excel;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxProfile;
	import org.testng.annotations.Test;

	public class DownloadDp
	{
		@Test
		public void f()
		{
			FirefoxProfile profile=new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2 );
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
			profile.setPreference("browser.download.lastDir", "F:\\Down");
			FirefoxDriver d=new FirefoxDriver(profile);
			d.get("https://maven.apache.org/download.cgi");
			d.findElement(By.linkText("apache-maven-3.5.0-bin.zip")).click();
		}

	}

