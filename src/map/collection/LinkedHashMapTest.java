package map.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> contacts = new LinkedHashMap<>();
		contacts.put(5, "five");
		contacts.put(3, "three");
		contacts.put(4, "four");
		contacts.put(1, "one");
		contacts.put(2, "two");
		contacts.put(null, null);
		contacts.put(3, "threee");
		contacts.put(null, null);
		for (Entry<Integer, String> contact : contacts.entrySet()) {
			System.out.println(contact);
		}
	}
}

// Insertion order maintains,It allows one null key and multiple null values, It
// is same as HashMap instead maintains insertion order