package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_like 
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver d=new FirefoxDriver();
			d.get("https://www.youtube.com");
			Thread.sleep(2000);
			d.findElement(By.name("search_query")).sendKeys("Tuje Bhigana Pasand Hai");
			Thread.sleep(2000);
			d.findElement(By.id("search-icon-legacy")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//a[@href='/watch?v=Z9yKTQEWoLA' and @id='video-title']")).click();
			Thread.sleep(2000);
	        d.findElement(By.xpath("//span[.='Share']/../../../../../ytd-segmented-like-dislike-button-renderer/div[1]")).click();
			Thread.sleep(2000);
			
		}
	}



