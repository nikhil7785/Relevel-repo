package Basic_Pattern;

import java.util.Scanner;

public class Find_MinMax_NO {

	public static void main(String[] args) {
		System.out.println("Enter 5 Number:- ");
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			 arr[i]=new Scanner(System.in).nextInt();
		}
		int min=arr[0];
		for(int i:arr)
		{
			if(i>min) //i<min
			{
				min=i;
			}
		}
		System.out.println("Minimum value is:- "+min);
	}

}
