package Basic_Pgm;

public class Print1_10_using_whileloop {

	public static void main(String[] args) {
		int no=1;
		while(no<=10)
		{
			if(no%2==0)
		{
				System.out.println("Even number is:"+no);
			}
			else
			{
				if(no%2==1)
				{
					System.out.println("Odd number is:"+no);
				}
			}
			
			no++;
		}
		

	}

}
