package set.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<Integer> contacts = new TreeSet<>();
		contacts.add(2);
		contacts.add(4);
		contacts.add(3);
		contacts.add(1);
		contacts.add(5);
		contacts.add(5); // duplicates are not allowed
		// contacts.add(null); null not allowed in TreeSet
		System.out.println(contacts);

	}
}

// Maintains ascending order, duplicates are not allowed, null values are not
// allowed, this class is not synchronized, however it can be synchronized
// explicitly like this: SortedSet s = Collections.synchronizedSortedSet(new
// TreeSet(...)); 