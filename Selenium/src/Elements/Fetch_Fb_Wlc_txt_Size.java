package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_Fb_Wlc_txt_Size {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	WebElement text = driver.findElement(By.xpath("//h2[contains(.,'Face')]"));
	Thread.sleep(2000);
	/*String wlc_text = text.getText();
	System.out.println(wlc_text);*/
	String fs = text.getCssValue("font.size");
	System.out.println(fs);
	
		

	}

}
