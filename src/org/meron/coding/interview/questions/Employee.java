package org.meron.coding.interview.questions;

public class Employee {
	
	private String fname;
	private int age;
	private String department;
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
	
	

}
