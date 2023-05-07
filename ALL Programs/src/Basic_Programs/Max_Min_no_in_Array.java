package Basic_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class Max_Min_no_in_Array {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(500);
		arr.add(50);
		arr.add(300);
		arr.add(50);
		arr.add(500);
		arr.add(600);
		
		int min=Collections.min(arr);
		int max=Collections.max(arr);
		
		System.out.println("minimum value is:- "+min);
		System.out.println("Maximun value is:- "+max);
		

	}

}
