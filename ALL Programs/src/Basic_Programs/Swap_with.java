package Basic_Programs;

import java.util.Scanner;

public class Swap_with {
	public static void main(String[] args) {
		//int a=10;
		//int b=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:- ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value:- ");
		int b=sc.nextInt();
		int temp;
		System.out.println("Before Swaping "+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+a+" "+b);
		
	}

}
