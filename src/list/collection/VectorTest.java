package list.collection;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> nums = new Vector<>();
		nums.add(6);
		nums.add(2);
		nums.add(5);
		nums.add(3);
		nums.add(1);
		nums.add(4);
		nums.add(6);
		nums.add(null);
		nums.add(null);
		for (Integer num : nums) {
			System.out.println(num);
		}
	}
}

// Vector is same as ArrayList except it is synchronized, it allows duplicate
// elements, allows multiple null elements