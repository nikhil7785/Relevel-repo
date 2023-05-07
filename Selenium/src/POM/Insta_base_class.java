package POM;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Insta_base_class   {
	@Test
	public void instascript() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		Insta_pomclass insta= new Insta_pomclass(driver);
				
		insta.user("niks13_d");
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	
	
	

	

}
