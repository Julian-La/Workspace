package test_function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		ArrayList<String> words= new ArrayList<>();
		words.add("Namex");
		words.add("Namex");
		words.add("Namey");
		words.add("Namez");
		words.add("Namex");
		words.add("Namey");
		words.add("Namex");
		words.add("Namex");
		Map<String,Integer>testMap = new HashMap<>();
		for(String a: words) {
			if(testMap.containsKey(a)) {
				int c = testMap.get(a);
				testMap.put(a, c+1);
			} else {
				testMap.put(a,1);
			}
		}
		for (Map.Entry<String, Integer> e : testMap.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
	}
}
}