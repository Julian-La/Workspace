package collections;

import java.util.Set;
import java.util.TreeSet;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		/**
		 * You can't write: Set<int>scores = new TreeSet<>(); because int is a primary datatype. 
		 * In Sets/Arrays you are only allowed to use classes. 
		 * Integer has it's own class, therefore it can be used.
		 * Having a own class is called boxing. 
		 */
		Set<Integer>scores = new TreeSet<>();
		/**
		 * Previously you had to write: 
		 * int a = 5;
		 * Inter b = new Interger(a);
		 * Since Version 5 you can typecast without redeclaring (instanceof):
		 */
		int a = 5;
		Integer b = a;
		System.out.println(b);
	}
}
