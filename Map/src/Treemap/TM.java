package Treemap;

//import java.util.TreeMapMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TM {
	public static void main(String[] args) {
		TreeMap<String,Integer> h=new TreeMap<String,Integer>();
		h.put("Elephent", 14);
		h.put("Rahino", 4);
		h.put("Huli", 5);
		h.put("Elephent", 2);
		h.put("Lion", 4);
		System.out.println(h);
		for(Entry x:h.entrySet())
		{
			System.out.println(x);
		}
	}

}
