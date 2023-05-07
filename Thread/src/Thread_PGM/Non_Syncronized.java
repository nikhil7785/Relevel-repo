package Thread_PGM;
class Kesaribhat extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Uppita implements Runnable
{
	public void run()
	{
		for(int j=101;j<=110;j++)
		{
			System.out.println(j);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}

public class Non_Syncronized {
	public static void main(String[] args) {
		Kesaribhat k=new Kesaribhat();
		Thread th1=new Thread(k);
		th1.start();
		Uppita u =new Uppita();
		Thread th2=new Thread(u);
		th2.start();
		
	}

}
