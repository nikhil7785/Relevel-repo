package Handling_Mul_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_countof_all_Textfield {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.in");
	Thread.sleep(2000);
	List<WebElement> text_field = driver.findElements(By.xpath("//input[@type='text']"));
	Thread.sleep(1500);
	int count = text_field.size();
	System.out.println(count);



	}

}
