package NA;

public class Facebook {
	public static void main(String[] args) {
		FB f=new FB();
		int a=f.Getter();
		System.out.println(a);
		f.Setter(1653);
		int p=f.Getter();
		System.out.println(p);
		
	}

}
class FB{
	private int fbpin=7785;
	public int Getter()
	{
		return fbpin;
	}
	public void Setter(int fbpin)
	{
		this.fbpin=fbpin;
	}
}

