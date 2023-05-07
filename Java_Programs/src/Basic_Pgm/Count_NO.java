package Basic_Pgm;

public class Count_NO {

	public static void main(String[] args) {
		int no=986064453;
		int count=0;
		while(no!=0)
		{
			count++;
			no=no/10;
		}
		System.out.println(count);

	}

}
