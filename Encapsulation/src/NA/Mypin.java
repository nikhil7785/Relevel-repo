package NA;

public class Mypin {
	public static void main(String[] args) {
		Icicbank i=new Icicbank();
		int a=i.Getter();
		System.out.println(a);
		i.Setter(7777);
		int x=i.Getter();
		System.out.println(x);
		
		
	}

}
class Icicbank
{
	private int atmpin=1234;
	public int Getter()
	{
		return atmpin;
	}
	public void Setter(int atmpin)
	{
	this.atmpin=atmpin;
		
		
	}
	
}
