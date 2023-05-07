package GC;

public class Garbase_coll_PGM {
	public static void main(String[] args) {
		Garbage g1=new Garbage();
		Garbage g2=new Garbage();
		Garbage g3=new Garbage();
		Garbage g4=new Garbage();
		g3=null;
		g2=null;
		System.gc();
	}
	public void finalize()
	{
		System.out.println("hey i am nikhil");
	}

}
