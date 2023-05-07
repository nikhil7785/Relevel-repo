package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insta_pomclass   {
	@FindBy(xpath="//input[@aria-label='Phone number, username, or email']")
    private WebElement	user_text;
	
	public Insta_pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void user(String data)
	{
		user_text.sendKeys(data);
	}
	
	

}
