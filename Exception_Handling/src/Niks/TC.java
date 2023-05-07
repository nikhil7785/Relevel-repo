package Niks;

public class TC {
	public static void main(String[] args) {
		System.out.println("main Start");
		/*try
		{
			int i=1/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception is handeld");
		}
		int [] arr={10,20,30};
		try
		{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled");
		}*/
		String s="Nikhil";
		/*try
		{
			System.out.println(s.charAt(11));
		}
		catch(StringIndexOutOfBoundsException n)
		{
			System.out.println("Handled");
		}*/
		s=null;
		try
		{
		System.out.println(s.hashCode());
		}
		catch(NullPointerException p)
		{
			System.out.println("_____Handled_____");
		}
		//System.out.println(2+5);
		System.out.println("main ends");
		
	}

}
