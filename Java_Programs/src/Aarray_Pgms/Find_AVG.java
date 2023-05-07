package Aarray_Pgms;

public class Find_AVG {
	public static void main(String[] args) {
		int[]arr= {10,50,6,8,7,2};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println(avg);
		
		
	}

}
