package org.meron.coding.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee{
	
	private String fname;
	private int age;
	private String department;
	
	public Employee(){}
	
	public Employee(String fname, int age, String department) {
		super();
		this.fname = fname;
		this.age = age;
		this.department = department;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
	
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", age=" + age + ", department=" + department + "]";
	}
		
	public static void main(String args[]){
		
		List<Employee> list = Arrays.asList(new Employee("Zeron" , 30, "CS"),
				new Employee("Dolley" , 20, "DB"),
				new Employee("Nolawi" , 3, "Medical"),
				new Employee("Abebe", 30, "CS")
				);			
				
	    Collections.sort(list , new nameAlphaComparator());
	    Collections.sort( list , new AgeComparator());
	    
		for(Employee e : list){
			System.out.println(e.toString());
		}	
		
	}
}

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return a.getAge()< b.getAge() ? -1 : a.getAge() == b.getAge() ? 0 : 1;
    }
}

class nameAlphaComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFname().compareToIgnoreCase(o2.getFname());
	}	
}

