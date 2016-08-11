package set.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<Integer> numbers = new LinkedHashSet<Integer>();
		numbers.add(6);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(1);
		numbers.add(6);
		numbers.add(null);
		numbers.add(null);
		System.out.println(numbers);
	}
}

/*
 * It maintains insertion order, duplicates are not allowed, only one null
 * values are allowed
 */