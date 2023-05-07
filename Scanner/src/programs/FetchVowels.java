package programs;

import java.util.Scanner;

public class FetchVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=sc.next();
		//String s1=sc.nextLine();
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			}
		}
	}

}
