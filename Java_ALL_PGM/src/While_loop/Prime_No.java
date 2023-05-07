package While_loop;

public class Prime_No {

	public static void main(String[] args) {
		int no=50;
		
		
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
			System.out.println("No is prime");
		}
		else
		{
			System.out.println("No is not prime");
		}

	}

}
