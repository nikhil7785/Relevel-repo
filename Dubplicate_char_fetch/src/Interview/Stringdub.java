package Interview;

public class Stringdub {
	public static void main(String[] args) {
		String s="Nikhilraje  Nikhilraje";
		//s=s.toUpperCase();
		char a[]=s.toCharArray();
		/*char a1[]=s.toCharArray();
		for (int i=0;i<a.length;i++){
			int count=0;
			for(int j=0;j<a1.length;j++){
				if(a[i]==a1[j]){
					count++;
					a1[j]=0;
				}
			}
			if(count>=1 && a[i]!=' '){
			System.out.println(a[i]+"------"+count);
			}
		}*/
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Cuplicate characters : "+a[i]);
				}
			}
				
			
		}
	}

}
