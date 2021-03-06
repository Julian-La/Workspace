package collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_Program {

	public static void main(String[] args) {
		/*
		 * Arrays can't return 2 values at once, therefore we use maps. 
		 */
		System.out.println("PhoneBookEntry without using a map:");
		ArrayList<PhoneBookEntry>phoneBook = new ArrayList<>();
		PhoneBookEntry p = new PhoneBookEntry();
		phoneBook.add(p);
		p.name = "Heinzen";
		p.phoneNumber = "+49 151 68123565";
		PhoneBookEntry n = new PhoneBookEntry();
		phoneBook.add(n);
		n.name = "M�ller";
		n.phoneNumber = "+49 151 99163565";
		PhoneBookEntry c = new PhoneBookEntry();
		phoneBook.add(c);
		c.name = "M�ller";
		c.phoneNumber = "+49 654 65400655";
		for(PhoneBookEntry e: phoneBook) {
			if(e.name.equals("M�ller")) {
				System.out.println(e.phoneNumber);
			}
		}
		System.out.println("--------------------");
		/*
		 * Treemap is way faster then our array:
		 * On the other hand, it's not possible to store 2 families with the same name.
		 * Newer keys overwrite old ones. 
		 * For that reason you can use .put(new Integer(number),"String"); to use a number as key. 
		 */
		TreeMap<String, String> phoneBook2 = new TreeMap<>();
		phoneBook2.put("M�ller", "+456465465");
		phoneBook2.put("M�ller","+49 222 56578777");
		phoneBook2.put("Heinzen","+4646546546");
		System.out.println("Is Family M�ller stored in our phonebook?");
		System.out.println(phoneBook2.containsKey("M�ller"));
		System.out.println("What's their number?");
		System.out.println(phoneBook2.get("M�ller"));
		System.out.println("-------------------");
		
		/*
		 * We still can't return 2 values, therefore we need to combine maps with sets:
		 * Keys are still singular. 
		 */
		Map<String, String> phoneBook1 = new HashMap<>();
		phoneBook1.put("M�ller", "+491234567890");
		phoneBook1.put("M�ller", "+491234567894");
		phoneBook1.put("Schmidt", "+490987654321");
		
		for (Map.Entry<String, String> e : phoneBook1.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		// phoneBook.remove("M�ller");
		// System.out.println(phoneBook.size());

	}
}


