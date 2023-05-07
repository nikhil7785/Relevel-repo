package Bank_ATMpin;

public class BOI
{
	private int atmpin=9975;
	public int getter()
	{
		return atmpin;
	}
	public void setter(int atmpin)
	{
		this.atmpin=atmpin;
	}

	public static void main(String[] args)
	{
		
		BOI b=new BOI();
		System.out.println(b.getter());
		System.out.println("____________");
		b.setter(7785);
		System.out.println(b.getter());
		
	
		
		
		
	}

}
