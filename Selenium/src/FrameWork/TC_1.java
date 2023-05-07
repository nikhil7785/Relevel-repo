package FrameWork;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_1 extends Base_Class 
{
// private static final Function ExpectedConditions.visibilityof() = null;

@Test
 public void register()
 {
	 wait.until(ExpectedConditions
			 .visibilityOf(driver.findElement(By.xpath("//a[.='Register']")))).click();
	 
	 Reporter.log("Interacted with register link",true);
	 
	 wait.until(ExpectedConditions
			 .visibilityOf(driver.findElement(By.xpath("//input[@id='gender-male']"))));
	 
	 driver.findElement(By.id("FirstName")).sendKeys("Nikhil");
	 driver.findElement(By.id("LastName")).sendKeys("Durve");
	 driver.findElement(By.id("Email")).sendKeys("nikhildurve1999@gmail.com");
	 driver.findElement(By.id("Password")).sendKeys("Niks13d");
	 driver.findElement(By.id("ConfirmPassword")).sendKeys("Niks13d");
	 driver.findElement(By.id("register-button")).click();
	 
	 
	 
	 
	 
	 }
}
