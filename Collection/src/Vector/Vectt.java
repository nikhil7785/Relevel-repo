package Vector;

//import java.util.ArrayList;
import java.util.Vector;

public class Vectt {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		System.out.println("a:-  "+v);
		System.out.println("______________________________________");
		Vector b=new Vector();
		b.add(80);
		b.add(60);
		b.add(30);
		b.add(40);
		System.out.println("b:-   "+b);
		System.out.println("______________________________________");
		System.out.println(v.get(1));
		System.out.println("______________________________________");
		v.addAll(b);
		System.out.println(v);
		System.out.println("____________________________________________");
		v.addAll(1, b);
		System.out.println(v);
		System.out.println("_____________________________________________");
		System.out.println(v+"  Before removing value");
		System.out.println("______________________________________");
		v.remove(2);
		System.out.println(v+"  After removing value");
		System.out.println("______________________________________________");
		v.removeAll(b);
		System.out.println(v);
		System.out.println("______________________________________");
		v.retainAll(b);
		System.out.println(v);
		System.out.println("___________________________________________");
		System.out.println(v.contains(20));
		System.out.println("_________________________________________________");
		System.out.println(v.size());
		System.out.println("_________________________________________________");
		System.out.println(v.capacity());
		
		
		
	}

}
