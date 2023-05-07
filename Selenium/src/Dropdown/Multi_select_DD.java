package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_select_DD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Nikhil%20Durve/Desktop/checkbox.html");
	Thread.sleep(2000);
	List<WebElement> cbox = driver.findElements(By.xpath("//input"));
	Thread.sleep(2000);
	for(WebElement drop: cbox)
	{
		drop.click();
	}
	Thread.sleep(2000);
	for(int i= cbox.size()-1;i>=0;i--)
	{
		WebElement check =  cbox.get(i);
		check.click();
		Thread.sleep(6000);
	}
	

	
	
	

	}

}
