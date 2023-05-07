package URL_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_on_B_F_R {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(2000);
	driver.navigate().to("https://www.youtube.com");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(3500);
	driver.navigate().refresh();
	Thread.sleep(2000);
	

	}


}
