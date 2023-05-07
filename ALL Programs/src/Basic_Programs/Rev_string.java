package Basic_Programs;

import java.util.Scanner;

public class Rev_string {

	public static void main(String[] args) {
		
	String s="nikhil";
		/*Scanner Sc=new Scanner (System.in);
		System.out.println("Enter the String :- ");
		String s = Sc.nextLine();
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		
		StringBuilder sb=new StringBuilder(s);
		String rev = sb.reverse().toString();
		System.out.println(rev);

	}

}
