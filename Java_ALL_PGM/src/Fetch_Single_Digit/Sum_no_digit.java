package Fetch_Single_Digit;

import java.util.Scanner;

public class Sum_no_digit {

	public static void main(String[] args) {
		//int no=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;

			
			
		}
		System.out.println(sum);
		
	}

}
