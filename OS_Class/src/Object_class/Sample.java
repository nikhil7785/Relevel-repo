package Object_class;

public class Sample {
	public static void main(String[] args) {
		Sample s= new Sample();
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println("_______________________________");
		Sample s1= new Sample();
		System.out.println(s1);
		System.out.println(s1.hashCode());
	}
	public int hashcode()
	{
		return 77857785;
	}
	

}
