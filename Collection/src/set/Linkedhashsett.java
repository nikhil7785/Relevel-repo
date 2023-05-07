package set;

import java.util.LinkedHashSet;

public class Linkedhashsett {
	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add(10);
		h.add(20);
		h.add(null);
		h.add(20);
		System.out.println(h);
		for(Object x:h)
		{
			System.out.println(x);
		}
		
		
	}


}
