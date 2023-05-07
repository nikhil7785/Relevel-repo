package Niks;

public class TCC {
	public static void main(String[] args) {
		System.out.println("main start");
		try{
			int i=1/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Handled");
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("caught");
		}
		System.out.println("main ends");
			
		
	
	}
}
