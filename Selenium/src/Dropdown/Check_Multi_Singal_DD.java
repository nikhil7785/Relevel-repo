package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_Multi_Singal_DD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Nikhil%20Durve/Desktop/Dropdown.html");
	Thread.sleep(2000);
	WebElement drop = driver.findElement(By.xpath("//select[@id='random name']"));
	Select sel=new Select(drop);
	if(sel.isMultiple())
	{
		System.out.println("Its Multi selected");
	}
	else
	{
		System.out.println("Its Singale selected");
	}
	
	
		

	}

}
