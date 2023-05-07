package Basic_Pattern;

import java.util.Scanner;

public class String_Palindrom {
	public static void main(String[] args) {
		System.out.println("Enter the String:- ");
		String s=new Scanner(System.in).nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		
			
		}
		System.out.println("After reverse the string:- "+rev);
		
	
	if(s.equals(rev))
	{
		System.out.println("It is palindrom");
	}
	else
	{
		System.out.println("It is Not palindrom");
	}

}
}
