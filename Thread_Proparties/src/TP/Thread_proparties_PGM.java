package TP;

public class Thread_proparties_PGM {
	public static void main(String[] args) {
		Thread th=Thread.currentThread();
		System.out.println(th.getName());
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println("_______________________________");
		{
			th.setName("Nikhil");
			th.setPriority(7);
			System.out.println(th.getName());
			System.out.println(th.getPriority());
		}
		
		
	}

}
