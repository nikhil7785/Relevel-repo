import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {
	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		
		System.setProperty(key,value);
		FirefoxDriver driver = new FirefoxDriver();
	}

}
