package list.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<Integer> nums = new LinkedList<>();
		nums.add(6);
		nums.add(2);
		nums.add(5);
		nums.add(3);
		nums.add(1);
		nums.add(4);
		nums.add(6);
		nums.add(null);
		nums.add(null);
		System.out.println(nums);
	}
}

/*
 * Internally it maintains doubly linked list for storing the element, allows
 * duplicate values, It maintains insertion order, it is non-synchronized, In
 * Java LinkedList class, manipulation is fast because no shifting needs to be
 * occurred, LinkedList is better for manipulating data.
 */
