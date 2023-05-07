package Object_class;

public class Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d);
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d.equals(d1));
		Demo a=d1;
		System.out.println(a);
		System.out.println(a.equals(d1));
		
	}

}
