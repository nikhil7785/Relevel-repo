package This_Calling_PGM;

public class Sample {
	
	Sample(int a)
	{
		System.out.println("Sunday");
	}
	Sample(double d)
	{
		this('N');
		System.out.println("Monday");
	}
	Sample(String s)
	{
		this(1317);
		System.out.println("Thusday");
	}
	Sample(char c)
	{
		this("Niks");
		System.out.println("Wednesday");
	}
	public static void main(String[] args) {
		new Sample(13.17);
		
	}

}
