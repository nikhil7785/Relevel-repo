package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Web_Shop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demowebshop.tricentis.com/books");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Computing and Internet']/../following-sibling::div[3]/div[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Fiction']/../following-sibling::div[3]/div[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Health Book']/../following-sibling::div[3]/div[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	Thread.sleep(2000);
	
	}

}
