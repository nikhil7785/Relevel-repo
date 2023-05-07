package Scenarios_Based;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sc_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	d.get("https://demoqa.com/webtables");
	Thread.sleep(2000);
	d.findElement(By.id("addNewRecordButton")).click();
	Thread.sleep(2000);
	d.findElement(By.id("firstName")).sendKeys("Nikhil");
	Thread.sleep(2000);
	d.findElement(By.id("lastName")).sendKeys("Durve");
	Thread.sleep(2000);
	d.findElement(By.id("userEmail")).sendKeys("niks13d@gmail.com");
	Thread.sleep(2000);
	d.findElement(By.id("age")).sendKeys("24");
	Thread.sleep(2000);
	d.findElement(By.id("salary")).sendKeys("500000");
	Thread.sleep(2000);
	d.findElement(By.id("department")).sendKeys("CSE");
	Thread.sleep(2000);
	d.findElement(By.id("submit")).click();
	}

}
