package map.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableTest {

	public static void main(String[] args) {
		Map<Integer, String> contacts = new Hashtable<>();
		contacts.put(4, "two");
		contacts.put(5, "five");
		contacts.put(8, "four");
		contacts.put(2, "one");
		contacts.put(3, "three");
		// contacts.put(null, "null"); // null key or value not allowed
		// contacts.put(6, null); // null value not allowed
		for (Entry<Integer, String> contact : contacts.entrySet()) {
			System.out.println(contact);
		}
	}
}

// It is synchronized, Insertion order not maintains, it stores the value as key
// value pair (entry), it internally maintains array of list, each list called
// as a bucket, depending on the hashCode() it determines the bucket and stores
// the element,it uses hashing technique, it doesn't allow null key or value