package Gmail3;

import org.testng.annotations.Test;

import G1.BaseClass;
import Gmail2.Pomclass;





public class TC1 extends BaseClass{
	@Test
	public void Testscript()
	{
		Pomclass p= new Pomclass(driver);
		p.mailid("nikhildurve99@gmail.com");
		p.button();
	}

}
