package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_frame_textFetch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		String pframe = driver.findElement(By.xpath("//body[.='Parent frame']")).getText();
		System.out.println("Text for Pframe:- "+pframe);
		driver.switchTo().frame(0);
		String cframe = driver.findElement(By.xpath("//p[.='Child Iframe']")).getText();
		System.out.println("Text for Cframe:- "+cframe);
		driver.switchTo().defaultContent();


	}

}
