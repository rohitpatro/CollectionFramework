package list.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
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
 * ArrayList class uses a dynamic array for storing the elements, it maintains
 * insertion order, allows duplicate values, allows null, it is
 * non-synchronized, In Java ArrayList class, manipulation is slow because a lot
 * of shifting needs to be occurred if any element is removed from the array
 * list. ArrayList is better for storing and accessing data.
 */