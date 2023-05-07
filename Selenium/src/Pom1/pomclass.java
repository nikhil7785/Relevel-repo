package Pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclass {
	@FindBy(xpath="//a[.='Register']")
    private WebElement	reg;
	//Reporter.log("Interact with Register link",true);
	
	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement redio;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement f_name;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement l_name;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email_text;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement p_pwd;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement c_pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement reg_btn;
	
	
	public pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void register_link()
	{
		reg.click();
		
	}
	public void rbutton()
	{
		redio.click();
	}
	public void fn(String fn)
	{
		f_name.sendKeys(fn);
	}
	public void ln(String ln)
	{
		l_name.sendKeys(ln);
	}
	public void email(String eid)
	{
		email_text.sendKeys(eid);
	}
	public void pass(String pass)
	{
		p_pwd.sendKeys(pass);
	}
	public void cpass(String cpass)
	{
		c_pwd.sendKeys(cpass);
	}
	public void rbtn()
	{
		reg_btn.click();
	}
	
	

	
	 

}
