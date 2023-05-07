package Basic_Pgm;

public class Count_Even_Odd_No {

	public static void main(String[] args) {
		int no=986064453;
		int even=0,odd=0;
		while(no!=0)
		{
			if(no%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			no=no/10;
		}
		System.out.println("Count of even nos:-"+even);
		System.out.println("Count of odd nos:-"+odd);



	}

}
