package Niks;

public class NestedTC {
	public static void main(String[] args) {
		System.out.println("main start");
		try{
			int i=8/2;
			int[]arr={10,20,30};
		try {
			System.out.println(arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Handled");
		}
		}
		catch(ArithmeticException b)
		{
			System.out.println("caught");
		}
		System.out.println("main ends");
			
		
	
	}

}
