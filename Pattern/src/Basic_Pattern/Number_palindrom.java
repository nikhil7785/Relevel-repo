package Basic_Pattern;

import java.util.Scanner;

public class Number_palindrom {

	public static void main(String[] args) {
		System.out.println("Enter the no:- ");
		int no=new Scanner(System.in).nextInt();
		int copy=no; int rev=0;
		
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			 no=no/10;
			 
			
		}
		
		if(rev==copy)
		{
			System.out.println("No is Palindrom");
		}
		else
		{
			System.out.println("No is not palindrom");
		}



	}

}
