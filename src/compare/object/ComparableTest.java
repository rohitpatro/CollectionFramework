package compare.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

	private int rollNumber;
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student student) {
		if (this.rollNumber > student.rollNumber)
			return 1;
		else if (this.rollNumber < student.rollNumber)
			return -1;
		else

			return 0;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name
				+ ", age=" + age + "]";
	}

}

public class ComparableTest {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(5, "Five", 12));
		students.add(new Student(1, "One", 43));
		students.add(new Student(3, "Three", 13));
		students.add(new Student(2, "Two", 32));
		students.add(new Student(4, "Four", 25));

		// Here students is Comparable type and it is short by rollNumber
		Collections.sort(students);
		for (Student student : students) {
			System.out.println(student.getRollNumber());
		}
	}
}