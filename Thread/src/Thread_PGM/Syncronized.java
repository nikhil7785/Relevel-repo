package Thread_PGM;

import java.io.File;
class Sample extends Thread
{
	public void run()
	{
		System.out.println("Hi ");
	}
	
}
class Demo extends Thread
{
	public void run()
	{
		System.out.println("Hello ");
	}
	
}

public class Syncronized {
	public static void main(String[] args) {
		Sample s=new Sample();
		Thread th1=new Thread(s);
		th1.start();
		Demo d=new Demo();
		Thread th2=new Thread(d);
		th2.start();
	}

}
