package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicScript {
	@Test
	public void test()
	{
		Reporter.log("beginning of framework",true);
	}
	@Test
	public void test1()
	{
		Reporter.log("End of framework",false);
		
	}

}
