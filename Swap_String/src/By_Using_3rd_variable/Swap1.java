package By_Using_3rd_variable;

import java.util.Scanner;

public class Swap1 {
	public static void main(String[] args) {
		//String s="Nikhil";
		//String p="Nikhilraje";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string:- ");
		String s=sc.next();
		System.out.println("Enter the 2nd String:- ");
		String p=sc.next();
		String temp=" ";
		System.out.println("Before Swaping "+s+"  "+p);
		temp=s;
		s=p;
		p=temp;
		System.out.println("After swaping "+s+" "+p);
	}

}
