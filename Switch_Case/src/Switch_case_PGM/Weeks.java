package Switch_case_PGM;

import java.util.Scanner;

public class Weeks {
	public static void main(String[] args) {
		//int day=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day:- ");
		int day=sc.nextInt();
		switch(day)
		{
		case 1:
		{
			System.out.println("Sunday");
			break;
		}
		case 2:
		{
			System.out.println("Monday");
			break;
		}
		case 3:
		{
			System.out.println("Tuesday");
			break;
		}
		case 4:
		{
			System.out.println("wednesday");
			break;
		}
		case 5:
		{
			System.out.println("Thresday");
			break;
		}
		case 6:
		{
			System.out.println("Friday");
			break;
		}
		case 7:
		{
			System.out.println("Shatarday");
			break;
		}
		default:
		{
			System.out.println("not available");
			break;
		}
		
		}
	}

}
