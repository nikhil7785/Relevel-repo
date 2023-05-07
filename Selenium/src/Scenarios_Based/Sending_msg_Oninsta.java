package Scenarios_Based;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sending_msg_Oninsta {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Niks13_d");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Raje@7785");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Messages']/../../div/a/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Send Message')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@type='text']/..")).sendKeys("niks13_d");
		//Thread.sleep(6000);*/
	}


}
