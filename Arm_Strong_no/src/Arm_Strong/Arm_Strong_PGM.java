package Arm_Strong;

import java.util.Scanner;

public class Arm_Strong_PGM {
	public static void main(String[] args) {
		//int no=1634;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=sc.nextInt();		
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem*rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("No is Armstrong");
		}
		else
		{
			System.out.println("No is not Armstrong");
		}
	}

}
