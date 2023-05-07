package By_using_interface;
interface Sample
{
	int a=40;
}
interface Demo
{
public void Hi();
}
class Tester implements Sample,Demo
{
	int a=40;
public void Hi()
	{
		System.out.println("Hey i am nikhil");
	}
}

public class Mainclass {
	public static void main(String[]args){
		Tester t=new Tester();
		System.out.println(t.a);
		t.Hi();
		
	
	
	
	}

}
