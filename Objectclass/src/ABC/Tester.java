package ABC;

public class Tester {
	public static void main(String[] args) {
		Tester t= new Tester();
		System.out.println(t);
		Tester t2=new Tester();
		System.out.println(t2);
		System.out.println(t.equals(t2));
		Tester n=t2;
		Tester n1=t;
		System.out.println(n.equals(t2));
		System.out.println(n1.equals(t));
		
		
		
		
	}

}
