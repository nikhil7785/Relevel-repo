package StringFunction;

public class Sample {
	public static void main(String[] args) {
		String s="NikhilRaje";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf('R'));
		System.out.println(s.concat(" I love you"));
		System.out.println(s.endsWith("Raje"));
		System.out.println(s.startsWith("Ni"));
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	
		
	}

}
