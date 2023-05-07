package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_Submit_Button {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	WebElement lnb = driver.findElement(By.xpath("//button[@type='submit']"));
	Thread.sleep(2000);
	if(lnb.isDisplayed())
	{
		if(lnb.isEnabled())
		{
			lnb.click();
		}
		else
		{
			System.out.println("Not Enabaled");
		}
		
	}
	else
	{
		System.out.println("Not Dispalyed");
	}

	}

}
