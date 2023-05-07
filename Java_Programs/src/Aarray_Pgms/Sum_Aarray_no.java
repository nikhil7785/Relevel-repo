package Aarray_Pgms;

public class Sum_Aarray_no {

	public static void main(String[] args) {
		int arr[]= {10,20,30,8,5,3};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			/*if(arr[i]%2==0)
			{
				sum=sum+arr[i];
				
			}
			
		}
		System.out.println("Sum of all even no:- "+sum);*/
		
			
		
			//else
		
		
			if(arr[i]%2==1)
			{
				sum=sum+arr[i];
				
			}
			
			
		}
		System.out.println("odd of all even no:- "+sum);
		
		System.out.println("Sum of aarray is:- "+sum);

	}

}
