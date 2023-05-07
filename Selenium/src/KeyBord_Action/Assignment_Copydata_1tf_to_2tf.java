package KeyBord_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Copydata_1tf_to_2tf {
	public static void main(String[]args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("Nikhil");
	Thread.sleep(2000);
	text.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(3000);
	text.sendKeys(Keys.CONTROL+"X");
	//text.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(3000);
	text.sendKeys(Keys.TAB);
	Thread.sleep(3000);
	text.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(1500);
}

}
