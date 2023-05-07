package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Map {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.google.com/maps/@12.9967741,77.5553067,16z");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Rajajinagar, Bengaluru, Karnataka");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Srirampura, Bengaluru, Karnataka");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../following-sibling::button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Details']")).click();
	Thread.sleep(2000);
	}

}
