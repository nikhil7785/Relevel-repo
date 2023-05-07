package Basic_Pgm;

public class Vowels {

	public static void main(String[] args) {
		/*String s="nikhil";
		int Vowela=0,Vowele=0,Voweli=0,Vowelo=0,Vowelu=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='a')
			{
				Vowela++;
			}
			if(s.charAt(i)=='e')
			{
				Vowele++;
			}
			if(s.charAt(i)=='i')
			{
				Voweli++;
			}
			if(s.charAt(i)=='o')
			{
				Vowelo++;
			}
			if(s.charAt(i)=='u')
			{
				Vowelu++;
			}
		}
		System.out.println("Vowela: "+Vowela);
		System.out.println("Vowele: "+Vowele);
		System.out.println("Voweli: "+Voweli);
		System.out.println("Vowelo: "+Vowelo);
		System.out.println("Vowelu: "+Vowelu);*/
		
		
		/*String s="Sachin";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				
			}
			else
				count++;
		}
		System.out.println(count);*/
		
		
		String s="nothing is impossible";
	    char[]arr= s.toCharArray();
	    int count=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==arr[i+1])
	    	{
	    		count++;
	    	}
	    	System.out.println(arr[i]);
	    }
		
		

	}

}
