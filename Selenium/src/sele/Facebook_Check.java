package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Check {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com");
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("Nikhil Durve");
		Thread.sleep(2000);
		d.findElement(By.name("pass")).sendKeys("Raje@7785");
		Thread.sleep(2000);
		d.findElement(By.name("login")).click();
		
		
	}

}
