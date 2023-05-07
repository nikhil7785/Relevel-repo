package miks;

public class Seprate {
	public static void main(String[] args) {
		String uc="";
		String lc="";
		String no="";
		String spl="";
		String s="Na@#$98Ii5465addadsacGSUSYHWJ23455";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				uc=uc+ch;
				
			}
			else if(ch>=97 && ch<=122)
			{
				lc=lc+ch;
				
			}
			else if(ch>=48 && ch<=57)
			{
				no=no+ch;
				
			}
			else
			{
				spl=spl+ch;
				
			}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(spl);
		System.out.println(no);
		
	}

}
