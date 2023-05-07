package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redio_Button_FB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(4000);
		WebElement redio = driver.findElement(By.xpath("//label[.='Male']"));
		if(redio.isSelected())
		{
			System.out.println(" Is Selected");
		}
		else
		{
			redio.click();
		}
		

	}

}
