package Basic_Programs;

public class DiscountException extends Exception 
{   
	String msg;
	DiscountException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
	

}
