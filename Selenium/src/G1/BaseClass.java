package G1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	@BeforeMethod
	public void Openapp()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		Reporter.log("Interacting to Browser",true);
		driver.get("htpps://www.gmail.com");
		Reporter.log("Interacting to Application",true);
		driver.manage().window().maximize();
		Reporter.log("Full Screen the Application",true);
		wait=new WebDriverWait(driver,10);
		
	}
	@AfterMethod
	public void Closeapp()
	{
		driver.close();
		Reporter.log("Close the application",true);
	}


}
