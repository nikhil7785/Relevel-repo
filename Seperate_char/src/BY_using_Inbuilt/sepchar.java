package BY_using_Inbuilt;

public class sepchar {
	public static void main(String[] args) {
		String uc="";
		String lc="";
		String no="";
		String spl="";
		String s="NA#@$^123456haydAishNikhi";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uc=uc+ch;
			}
			else if(Character.isLowerCase(ch))
			{
				lc=lc+ch;
			}
			else if(Character.isDigit(ch))
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
		System.out.println(no);
		System.out.println(spl);
	}

}
