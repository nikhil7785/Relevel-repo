package Array_pgm;

public class Count_even_no {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,9,7};
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
