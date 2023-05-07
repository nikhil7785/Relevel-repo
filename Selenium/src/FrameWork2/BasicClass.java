package FrameWork2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasicClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public static void Openapp()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		Reporter.log("Browser Launched",true);
		driver.get("https://www.moneycontrol.com/");
		Reporter.log("Application Launched",true);
		wait=new WebDriverWait(driver,10);
		
	}
	@AfterMethod
	public static void CloseApp()
	{
		driver.close();
	}


}
