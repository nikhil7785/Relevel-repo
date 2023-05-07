package Basic_Programs;

public class Bassu2 {
	public static void main(String[] args) {
		String s="Hello hi bye Good byyy";
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++){
			c[i]=s.charAt(i);
		}
		//System.out.println(c.length);
		for(int i=0;i<c.length;i++){
		if((c[i]=='a'&& c[i]=='A')||(c[i]=='E'&&c[i]=='e')||(c[i]=='i'&&c[i]=='I')||(c[i]=='o'&&c[i]=='O')){
			System.out.println(c[i]);
		}
		
		
		}
		
		
	}

}
