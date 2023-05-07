package JSP_Question;

import java.util.Scanner;

public class vowels_not_present {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=ip.next();
		int vowels=0;
		for(int i=0;i<s.length();i++)
		{ char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				vowels++;
			}

		}
		System.out.println("Vowels: "+ vowels);
	}
	

}
