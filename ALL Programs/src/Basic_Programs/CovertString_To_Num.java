package Basic_Programs;

public class CovertString_To_Num {

	public static void main(String[] args) {
		
		String s="Nikhil";
		int n=0;
		for(int i=0;i<s.length();i++)
		{
			n=n*10+(s.charAt(i)-'0');
		}
		//int n = Integer.parseInt(s);
		System.out.println("Srting is in No Format:-"+n);
		
		
		

	}

}
