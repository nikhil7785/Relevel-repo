package Niks;

public class Shadhidotcom {
	 static void Agesubmit() throws MarrriageException {
		int age=20;
		if(age>=21)
		{
			System.out.println("Welcome to Shadidotcom website");
		}
		else
		{
			throw new MarrriageException("Child chapati");
		}
	 }
		
	
	 public static void main(String[] args) {
		 try
		 {
		 Agesubmit();
		 }
		 catch(MarrriageException m)
		 {
			 System.out.println(m.Getmsg());
		 }
		
	}
}
	 class MarrriageException extends Exception
	 {
		 String msg;
		 MarrriageException(String msg)
		 {
			 this.msg=msg;
		 }
		 public String Getmsg()
		 {
			 return msg;
		 }
	 }


