package Aarray_Pgms;

public class Count_Aarray {

	public static void main(String[] args) {
		int []arr= {10,2,8,3,5,0};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even number of array:- "+arr[i]);
				count++;
			}
			else 
			{
				if(arr[i]%2==1)
				{
					System.out.println("odd number of array:- "+arr[i]);
					count++;
				}
			}
         //   System.out.println(count);
			
		}
		
	}

}
