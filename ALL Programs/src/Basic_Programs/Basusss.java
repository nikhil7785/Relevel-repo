package Basic_Programs;

public class Basusss {

	public static void main(String[] args) {
		int [] arr={10,20,30,41};
		int max=arr[1];int min=arr[2];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		int x=max;
		int c=0;
		for(int h=1;h<=x;h++)
		{
			if(x%h==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("Prime number");
		}
		else{
			System.out.println("not a prime number");
		}
		


	}

}
