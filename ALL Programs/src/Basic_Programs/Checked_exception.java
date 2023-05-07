package Basic_Programs;

public class Checked_exception 
{
	static void buy() throws DiscountException 
	{
		int price=49999;
		if(price>50000)
		{
			System.out.println("20% Offer");
		}
		else
		{
			throw new DiscountException("No Discount");
		}
	}
	
public static void main(String[] args) 
{  
	try
	{
	buy();
	}
	catch(DiscountException e)
	{
		System.out.println(e.getmessage());
	}
	
}
}
