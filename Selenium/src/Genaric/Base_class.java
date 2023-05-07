package Genaric;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class {
	
	public static  WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/login");
		 wait=new WebDriverWait(driver,10);
		 Reporter.log("Open the application",true);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		Reporter.log("close the application",true);
	}
	

}
