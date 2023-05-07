package Array_pgm;

public class Sum_of_even_no {

	public static void main(String[] args) {
	   int [] arr= {10,20,30,40,9,7};
	   int sum=0;
	   for(int i=0;i<=arr.length-1;i++)
	   {
		   if(arr[i]%2==0)
		   {
			   sum=sum+arr[i];
		   }
		   
	   }
	   System.out.println(sum);
	}

}
