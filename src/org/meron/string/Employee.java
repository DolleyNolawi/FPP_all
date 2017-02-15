package org.meron.string;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public Employee(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public static Comparator<Employee> salaryComp = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return (int) (o1.getSalary() - o2.getSalary());
		}
	};

	@Override
	// this is overriden to print the user friendly information about the
	// Employee
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
	}

	public static void main(String[] args){
		//sorting object array
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		
		int x =4;
		for(Employee e : empArr){
			while(x>0){
				x--;
				System.out.print(x);
				
				if(x==2)continue;
				
			}
		}

		//sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
		
		Arrays.sort(empArr , Employee.salaryComp);
		System.out.println(Arrays.toString(empArr));
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return (this.id - emp.id);
	}
	
	
}
