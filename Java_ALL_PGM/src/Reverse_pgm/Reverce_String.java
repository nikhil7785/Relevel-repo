package Reverse_pgm;

public class Reverce_String {

	public static void main(String[] args) {
		String s="NIkhil";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);



	}

}
