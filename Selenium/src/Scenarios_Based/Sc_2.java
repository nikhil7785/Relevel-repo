package Scenarios_Based;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://demoqa.com/text-box");
	Thread.sleep(2000);
	d.findElement(By.id("userName")).sendKeys("NIKHIL");
	Thread.sleep(2000);
	d.findElement(By.id("userEmail")).sendKeys("niks13d@gmail.com");
	Thread.sleep(2000);
	d.findElement(By.id("currentAddress")).sendKeys("AP/Umadi Tal:-Jath,Dist:-Sangli");
	Thread.sleep(2000);
	d.findElement(By.id("permanentAddress")).sendKeys("AP/Umadi Tal:-Jath,Dist:-Sangli");
	Thread.sleep(2000);
	d.findElement(By.id("submit")).click();
	
	}

}
