package Number;

import java.util.Scanner;

public class Palli_No_PGM {
	public static void main(String[] args) {
		//int no=121;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=sc.nextInt();
				
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
			
		}
		if(rev==copy)
		{
			System.out.println("No is pallindrom");
		}
		else
		{
			System.out.println("No is not pallindrom");
		}
		
	}

}
