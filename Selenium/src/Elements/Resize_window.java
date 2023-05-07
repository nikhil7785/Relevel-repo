package Elements;

import java.nio.file.DirectoryNotEmptyException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_window {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.facebook.com");
Thread.sleep(2000);
Dimension d = new Dimension(500, 350);
driver.manage().window().setSize(d);


	}

}
