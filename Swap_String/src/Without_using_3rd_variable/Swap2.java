package Without_using_3rd_variable;

public class Swap2 {
	public static void main(String[] args) {
		String s="Nikhilraje";
		String p="Nikhil";
		System.out.println("Before Swaping "+s+" "+p);
		s=s+p;
		p=s.substring(0,s.length()-p.length());
		s=s.substring(p.length());
		System.out.println("After swaping "+s+" "+p);
		
		
	}


}
