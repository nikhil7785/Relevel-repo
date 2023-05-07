package Super_Calling_PGM;

	/*class Sample
	{
		Sample(int a)
		{
			System.out.println("Hello");
		}
	}
	class Demo extends Sample
	{
		Demo(String b)
		{
			super(10);
			System.out.println("HI");
		}
	}
	public class SUPER_MAIN_pgm {
	public static void main(String[] args) {
		new Demo("Hi");
		
	
			
		}
		
	}*/

	

	
	class Sample 
	{
		Sample(String s)
		{
			super(17.13d);
			System.out.println("Hey i am nikhil");
		}
	}
	class Demo extends Sample
	{
		Demo(int i)
		{
			super('N');
			System.out.println("Hey i am aishu");
		}
	}
	class Tester extends Demo
	{
		Tester(char c)
		{
			super(17.13);
			System.out.println("Hey i am Deelip");
		}
	}
	class Dev extends Tester
	{
		Dev(double d)
		{
			super("Hi");
			System.out.println("Hey i am Suraj");
		}
	}
	public class SUPER_MAIN_pgm {
		public static void main(String[] args) {
			new Sample(13);
			
		
				
			}
			
		}


		
	


