package programs;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("No is prime");
		}
		else
		{
			System.out.println("No is not prime");
		}
		
		
	}

}
