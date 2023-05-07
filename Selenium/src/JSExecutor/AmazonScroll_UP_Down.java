package JSExecutor;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScroll_UP_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.Amazon.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript(arg0, arg1)
		
		

	}

}
