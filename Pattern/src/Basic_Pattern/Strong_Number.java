package Basic_Pattern;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		System.out.println("Enter the no:- ");
		int no=new Scanner(System.in).nextInt();
		int copy=no; int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			int fact =1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			
			sum=sum+fact;
			no=no/10;
		}
		
		if(sum==copy)
		{
			System.out.println("No is Strong");
		}
		else
		{
			System.out.println("No is not a Strong ");
		}
	

	}

}
