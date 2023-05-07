package set;

import java.util.TreeSet;

public class Treesett {
	public static void main(String[] args) {
		TreeSet h=new TreeSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(20);
		System.out.println(h);
		for(Object x:h)
		{
			System.out.println(x);
		}
		
		
	}

}
