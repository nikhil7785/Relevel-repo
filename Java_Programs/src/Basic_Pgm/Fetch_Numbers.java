package Basic_Pgm;

import java.util.Scanner;

public class Fetch_Numbers {

	public static void main(String[] args) {
		//int no=986064453;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=s.nextInt();
		
		while(no!=0)
		{
			int rem=no%10;
			System.out.println(rem);
			no=no/10;
		}
		
		
		

	}

}
