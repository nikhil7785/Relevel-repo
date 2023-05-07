package Basic_Programs;

import java.util.Scanner;

public class Fetch_largest_Smaller_no {

	public static void main(String[] args) {
		int []arr= {100,20,6,-89,45};
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int size=sc.nextInt();
		int[]arr=new int[size];*/
		int fl=0,sl=0,tl=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				tl=sl;
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl)
			{
				tl=sl;
				sl=arr[i];
			}
			else
			{
				tl=arr[i];
			}
		}
		System.out.println(fl);
		System.out.println(sl);
		System.out.println(tl);

	}

}
