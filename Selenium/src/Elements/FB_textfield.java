package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_textfield {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	if(text.isDisplayed())
	{
		text.sendKeys("Nikhil Durve");
	}
	else
	{
		System.out.println("Not displayed");
	}

	}

}
