package set.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		nums.add(3);
		nums.add(1);
		nums.add(5);
		nums.add(7);
		nums.add(2);
		nums.add(3);
		nums.add(null);
		nums.add(null);
		for (Integer num : nums) {
			System.out.println(num);
		}
	}
}

/*
 * It doesn't maintains insertion order, duplicates are not allowed, uses
 * hashtable to store the element
 */