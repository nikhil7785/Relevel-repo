package Handling_Mul_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_countof_all_Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	Thread.sleep(2000);
	int count = links.size();
	System.out.println(count);
	
	
	

	}

}
