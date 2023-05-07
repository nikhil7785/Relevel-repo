package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partial_Link_Text {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	d.get("https://www.youtube.com");
	Thread.sleep(2000);
	//d.findElement(By.id("search")).sendKeys("Neha Kakkar Songs");
	d.findElement(By.partialLinkText("Music")).click();
		
	}

}
