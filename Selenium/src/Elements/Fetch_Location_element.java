package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Location_element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	WebElement link_element = driver.findElement(By.xpath("//a[.='मराठी']"));
	Point loc = link_element.getLocation();
	System.out.println(loc);
	int x = loc.getX();
	int y = loc.getY();
	System.out.println("X axes:- "+x);
	System.out.println("Y axes:- "+y);
	}

}
