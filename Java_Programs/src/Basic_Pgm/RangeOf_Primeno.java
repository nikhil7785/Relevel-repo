package Basic_Pgm;

public class RangeOf_Primeno {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int no=i;
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(no%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Prime numbers are:- "+i);
				
			}
		}

	}

}
