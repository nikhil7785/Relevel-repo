package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Niks13_d");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Raje@7785");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sandeep shadakshari");
		//Thread.sleep(2000);*/
		
	}

}
