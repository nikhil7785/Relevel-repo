package POM;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FB_base_class {
	@Test
	public void fbscript() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//Thread.sleep(2000);
		
		Fb_pomclass pmc = new Fb_pomclass (driver);
		pmc.email("hello");
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//pmc.email("hi");
		//Thread.sleep(2000);
		pmc.pass("9860644532");
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//pmc.pass("9284140237");
		//Thread.sleep(2000);
		pmc.button();
		
		
		
		
		
	}
	

}
