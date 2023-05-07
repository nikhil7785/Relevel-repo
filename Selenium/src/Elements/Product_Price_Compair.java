package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Price_Compair {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iPhone12");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	WebElement cost = driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (Black, 128 GB)']/../following-sibling::div/div/div/div"));
    Thread.sleep(3000);
    String Fcost = cost.getAttribute("div");
    System.out.println(Fcost);

	}

}
