package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Frames_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		String text1 = driver.findElement(By.xpath("//h1[.='This is a sample page']")).getText();
		System.out.println("F1 text is :- "+text1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		String text2 = driver.findElement(By.xpath("//h1[contains(.,'This')]")).getText();
		System.out.println("F2 text is:- "+text2);
		driver.switchTo().defaultContent();
		
		
	}

}
