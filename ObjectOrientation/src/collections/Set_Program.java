package collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Set_Program {

	public static void main(String[] args) {
		/*
		 * HashSet destroys the order of your array.
		 * Therefore it filters duplicates out AND it's way faster then
		 * the regular ArrayList because data is saved with hashing. (index)
		 * ------------------------------------------------
		 * You can also add the interface Set first and define your actual set later on:
		 * Set<String> students = new Hashset<>();
		 */
		HashSet<String> students = new HashSet<>();
		students.add("Monika");
		students.add("Richard");
		students.add("Simone");
		students.add("Monika");
		for(String student:students) {
			System.out.println(student);
		}
		if(students.contains("Thomas")) {
			System.out.println("Student ist auf der Liste.");
			System.out.println("^^^^^^^HashSet was used above");
		} else {
			System.out.println("Student steht nicht auf der Liste!");
			System.out.println("^^^^^^^HashSet was used above");
		}
		/*
		 * A TreeSet like all Set refuses duplicate values.
		 * TreeSet will sort your array at all times. 
		 * Collections.sort() allows to sort the list on differents criterias 
		 * using different Comparators. With a TreeSet, you can also give a 
		 * Comparator but you will need to instantiate one TreeSet for each Comparator.
		 */
		TreeSet<String> students2 = new TreeSet<>();
		students2.add("Selina");
		students2.add("Anna");
		students2.add("Theresa");
		students2.add("Anna");
		for(String studentInTree:students2) {
			System.out.println(studentInTree);
		}
		System.out.println("^^^^^^^TreeSet was used above");
		/*
		 * Comparing an array with a set and only return words once. Order shall be maintained. 
		 */
		String[] words = {"Wetter", "Fluss", "Wetter", "Party"};
        TreeSet<String> s = new TreeSet<>(); 
        for(String word : words) {
            if (s.contains(word)) {
                continue;
            }
            s.add(word);
            System.out.println(word);
}
        System.out.println("^^^^^^^Array was compared with a Set and values were returned once");
}
}