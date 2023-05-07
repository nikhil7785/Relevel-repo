package DynamicSC;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Armstrong {
	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the no:- ");
	 int n=sc.nextInt();
	 int n1=n,n2=n;
	 int count=0,sum=0,rem=0; 
	 while(n!=0)
	 {
		 n=n/10;
		 count++;
	 }
	 
	 while(n1!=0)
	 {
		 rem=n1%10;
		 int pow=1;
		 for(int i=1;i<=count;i++)
		 {
			pow=pow*rem; 
		 }
		 sum=sum+pow;
		 n1=n1/10;
	 }
	 if(sum==n2)
	 {
		 System.out.println("armstrong no");
	 }
	 else
	 {
		 System.out.println("not a armstrong no");
	 }
	}
}