package map.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> contacts = new HashMap<>();
		contacts.put(5, "five");
		contacts.put(3, "three");
		contacts.put(4, "four");
		contacts.put(1, "one");
		contacts.put(2, "two");
		contacts.put(2, "2nd two"); // duplicates overrides the old one
		contacts.put(null, null);
		contacts.put(null, "test"); // overrides the previous null key
		System.out.println(contacts);
	}
}

// HashMap is non-synchronized, allows one null key and multiple null values,
// duplicates are not allowed, overrides the old value with new one
// maintains no order. HashMap is fail-fast, it throws
// ConcurrencyModificationException(+)
