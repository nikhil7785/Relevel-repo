package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1500);
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(2000);
	WebElement fashion = driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.moveToElement(fashion).perform();
	
	


	}

}
