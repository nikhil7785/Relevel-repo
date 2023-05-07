package DynamicSC;

import java.util.Scanner;

public class Strongno {
	public static void main(String[] args) {
		//int no=145;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=sc.nextInt();
		int copy=no;
		
		int sum=0;
		while(no!=0)
		
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("no is strong");
		}
		else
		{
			System.out.println("Not a strong no");
		}
	}
		
	


}
