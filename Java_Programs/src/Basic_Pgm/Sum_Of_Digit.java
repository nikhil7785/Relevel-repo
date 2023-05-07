package Basic_Pgm;

public class Sum_Of_Digit {

	public static void main(String[] args) {
		int no=123456;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Addition of numbers:- "+sum);

	}

}
