package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Sizeof_Element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver 	driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.facebook.com");
Thread.sleep(2000);
WebElement text = driver.findElement(By.xpath("//h2[contains(.,'Face')]"));
Thread.sleep(3000);
String fs = text.getCssValue("font.size");
System.out.println(fs);

WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
Dimension size = btn.getSize();
System.out.println(size);
int h = size.getHeight();
int w = size.getWidth();
System.out.println(h+"  "+w);

	

	}

}
