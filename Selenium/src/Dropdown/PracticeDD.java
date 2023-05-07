package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDD {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(2000);
		
		WebElement dd = driver.findElement(By.tagName("select"));
		Select sel=new Select(dd);
		List<WebElement> options = sel.getOptions();
		for(WebElement option:options)
		{
			String text = option.getText();
			System.out.println(text);
		}
		
		
		
		
	}

}
