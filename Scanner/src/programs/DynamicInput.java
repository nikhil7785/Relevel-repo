package programs;

import java.util.Scanner;

public class DynamicInput {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2st value: ");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}
		
	}

