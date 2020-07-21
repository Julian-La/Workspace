package frequencyOfWords;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyAnalyser {
	
	/**
	 * 
	 * Since we use Java 8 or higher, we can avoid building StringSort class by using:
	 * list.sort((o1,o2)->-Integer.compare(o1.getOccurence(),o2.getOccurence()));
	 * in line 34. (Collections are needless here)
	 */
	
	public List<StringFrequency> analyse(List<String>words) {
		HashMap<String, Integer> occurences = new HashMap<>();
		for(String word: words) {
			if(occurences.containsKey(word)) {
				int n = occurences.get(word);
				occurences.put(word, n+1);
			}else {
			occurences.put(word, 1);
			}
		}
		
		ArrayList <StringFrequency> list = new ArrayList<>();		
		for(Map.Entry<String, Integer>q:occurences.entrySet()) {
			list.add(new StringFrequency(q.getKey(),q.getValue()));
			//System.out.println(q.getKey()+" : "+q.getValue());
		}
		
		Collections.sort(list, new StringSort());
		
//		for(StringFrequency s: list) {
//			System.out.println(s.getWord()+" : "+s.getOccurence());
//		}
//		return null;
		return list;
	}
}