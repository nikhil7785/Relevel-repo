package LinkedHashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LHM {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> h=new LinkedHashMap<String,Integer>();
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
