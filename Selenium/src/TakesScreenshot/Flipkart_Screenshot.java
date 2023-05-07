package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.seleniumhq.jetty9.servlet.FilterHolder;

public class Flipkart_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.Flipkart.com");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srs = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\Nikhil Durve\\Desktop\\Screenshot\\Flipkartdefect.jpeg");
		FileHandler.copy(srs, dst);
		

	}

}
