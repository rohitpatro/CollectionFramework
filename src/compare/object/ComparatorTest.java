package compare.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "]";
	}

}

class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		if (employee1.getEmployeeId() > employee2.getEmployeeId())
			return 1;
		else if (employee1.getEmployeeId() < employee2.getEmployeeId())
			return -1;
		else
			return 0;
	}
}

class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		if (employee1.getSalary() > employee2.getSalary())
			return 1;
		else if (employee1.getSalary() < employee2.getSalary())
			return -1;
		else
			return 0;
	}
}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		return employee1.getEmployeeName().compareTo(
				employee2.getEmployeeName());
	}

}

public class ComparatorTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(4, "a", 45000));
		employees.add(new Employee(2, "d", 25000));
		employees.add(new Employee(5, "c", 40000));
		employees.add(new Employee(1, "e", 64000));
		employees.add(new Employee(3, "b", 32000));

		// EmployeeIdComparator
		System.out.println("EmployeeID Comparator\n---------------------");
		Collections.sort(employees, new EmployeeIdComparator());
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeId());
		}

		// SalaryComparator
		System.out.println("\nSalary Comparator\n-----------------");
		Collections.sort(employees, new SalaryComparator());
		for (Employee employee : employees) {
			System.out.println(employee.getSalary());
		}

		// NameComparator
		System.out.println("\nName Comparator\n---------------");
		Collections.sort(employees, new NameComparator());
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeName());
		}
	}
}