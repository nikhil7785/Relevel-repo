package Java;

public class Whatsapp {

	public static void main(String[] args){
		 Wp3 v= new  Wp3();
		 v.payment();
		 v.reels();
		 v.chats();
	}
		
	}
	abstract class Wp
	{
		void chats()
		{
			System.out.println("Chats Feature");
		}
		abstract void reels();
		abstract void payment();
	}
	abstract class Wp2 extends Wp
	{
		void reels()
		{
			System.out.println("reels Feature");
		}
	}
	 class Wp3 extends Wp2
	{
		void payment()
		{
			System.out.println("payment Feature");
		}
	}
	
	