package Numbers;

import java.util.Scanner;

public class Strong_no {

	public static void main(String[] args) {
		//int no=145; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		int sum=0;int copy=no;
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
			System.out.println("No is Strong");
		}
		else
		{
			System.out.println("No is not a Strong ");
		}
		


	}

}
