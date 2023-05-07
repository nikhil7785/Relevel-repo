package Family.myfamily;

public class Father
{
	private void ATMcard()
	{
		System.out.println("Dad ka ATMcardu");
	}
	void car()
	{
		System.out.println("Dad ka caruuu");
	}
	protected void Bike()
	{
		System.out.println("Dad ka Baikuuuu");
	}
	public void Cycle()
	{
		System.out.println("Dad ka Cycluuuu");
	}
  static class Son
{
	public static void main(String[] args) {
		Father f=new Father();
		f.ATMcard();
		f.Bike();
		f.car();
		f.Cycle();
	}
		
	}
}
		


