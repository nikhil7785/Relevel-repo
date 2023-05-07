package NA;

public class Insta 
{
    private String pwd="nikhil";
	public String getter()
	{
		return pwd;
	}
	public void setter(String pwd)
	{
		this.pwd=pwd;
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		Insta i=new Insta();
		System.out.println(i.getter());
		System.out.println("____________");
		i.setter("Nikhilraje");
		System.out.println(i.getter());
		
	}

}
