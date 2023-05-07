package Basic_Pgm;

import java.util.Scanner;

public class Prime_NO {

	public static void main(String[] args) {
		//int no=5;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = s.nextInt();
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("No is prime:");
		}
		else
		{
			System.out.println("No is not prime:");
		}

	}

}
