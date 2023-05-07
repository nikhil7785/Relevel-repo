package Testscripts;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Genaric.Base_class;
import Pom1.pomclass;

public class Tc_webshop extends Base_class 
{
	@Test
	public void register()
	{
		pomclass pmc=new pomclass(driver);
		pmc.register_link();
		pmc.rbutton();
		pmc.fn("Nikhil");
		pmc.ln("Durve");
		pmc.email("ndurve17@gmail.com");
		pmc.pass("niks13d");
		pmc.cpass("niks13d");
		pmc.rbtn();
		Reporter.log("Register successful",true);
	}
	

}
