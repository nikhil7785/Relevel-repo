package Scenarios_Based;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sc_3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	d.get("https://www.youtube.com");
	Thread.sleep(2000);
	d.findElement(By.name("search_query")).sendKeys("cheluvina chittara songs");
	Thread.sleep(2000);
	d.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(2000);
	d.findElement(By.partialLinkText("Cheluvina Chittara Film Songs Collection ")).click();
	//Thread.sleep(2000);
	d.findElement(By.xpath("button[aria-label='like this video along with 6,104 other people']")).click();
	
		

	}

}
