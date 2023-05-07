package Swapping;

import java.util.Scanner;

public class BY_Using_3rd {

	public static void main(String[] args) {
		//int a=10; int b=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter B value: ");
		int b = sc.nextInt();
		
		System.out.println("Before swapping: "+a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: "+a+" "+b);
		
		
		

	}

}
