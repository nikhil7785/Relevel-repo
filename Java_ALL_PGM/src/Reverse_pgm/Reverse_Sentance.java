package Reverse_pgm;

public class Reverse_Sentance {

	public static void main(String[] args) {
		String s="I am Nikhil durve  Umadi  ";
		String arr[] = s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.print(arr[i]+" ");
			if(i==(arr.length/3))
			{
				String a=arr[i];
				String rev=" ";
				for(int j=a.length()-1;j>=0;j--)
				{
					rev=rev+a.charAt(j);
				}
				System.out.print(rev+" ");
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
