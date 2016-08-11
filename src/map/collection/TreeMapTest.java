package map.collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> contacts = new TreeMap<Integer, String>();
		contacts.put(1, "One");
		contacts.put(3, "Three");
		contacts.put(5, "Five");
		contacts.put(4, "Four");
		contacts.put(2, "Two");
		contacts.put(6, null);
		contacts.put(8, null);
		// contacts.put(null, "test"); // null key not allowed, will throw NullPointerException
		for (Entry<Integer, String> contact : contacts.entrySet()) {
			System.out.println(contact.getKey() + " " + contact.getValue());
		}
	}
}

// Maintains Ascending Order , null key not allowed, multiple null value
// allowed, contains unique elements
