package Basic_Pgm;

public class Fetch_Even_and_Odd{

	public static void main(String[] args) {
		int no=986064453;
		while(no!=0)
		{
			if(no%2==0)
			{
				int rem=no%10;
				System.out.println("Even nos:-"+rem);
			}
			else
			{
				if(no%2==1)
				{
					int rem1=no%10;
					System.out.println("Odd nos:- "+rem1);
				}
			}
			no=no/10;
		}

	}

}
