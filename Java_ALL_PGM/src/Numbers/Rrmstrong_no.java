package Numbers;

import java.util.Scanner;

public class Rrmstrong_no {

	public static void main(String[] args) 
	{
		//int no=153;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		int sum=0; int copy=no;
		while(no!=0)
		{
			int rem= no%10;
			sum=sum+(rem*rem*rem);
			//sum=Math.pow(rem, 3);
			no=no/10;
		}

		if(copy==sum)
		{
			System.out.println("No is armstrong");
		}
		else
		{
			System.out.println(" its not armstrong no ");
		}
	}

}
