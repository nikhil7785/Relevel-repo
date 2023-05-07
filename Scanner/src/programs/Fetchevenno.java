package programs;

import java.util.Scanner;

public class Fetchevenno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		 int no=sc.nextInt();
		 while(no!=0)
		 {
			 if(no%2==0)
			 {
				 int rem=no%10;
				 System.out.println(rem);
			 }
	
			 no=no/10;
			 
			 
		 }
		
	}

}
