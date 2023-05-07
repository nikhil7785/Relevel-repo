package java;
interface mp
{
	void status();
	void payment();
	
}
interface Wp extends mp
{
	void status();
	void payment();
}
abstract class Wp2 implements Wp
{
	public void status()
	{
		System.out.println("status feature");
		
	}
	
}
class Wp3 extends Wp2
{
	public void payment()
	{
		System.out.println("payment feature");
	}
}


public class mainclass {
	public static void main(String[]args){
		Wp3 w=new Wp3();
		w.status();
		w.payment();
		
	}
	

}

	


