package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shadhi_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.shaadi.com");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[data-testid='login_link']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Nikhil Durve");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("9860644532");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
