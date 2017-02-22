package org.meron.coding.interview.questions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Customer {
	
	public String fname;
	public String lname;
	public Date dob;	

	public Customer(String fname, String lname, Date dob) {
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", dob=" + dob + "]";
	}

	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		List<Customer> cust = Arrays.asList(
				new Customer("meron", "a", df.parse("12-10-1986")),
				new Customer("meseret", "a", df.parse("3-10-1988")),
				new Customer("Nolawi", "a", df.parse("7-7-2013"))				
				);
		//Collections.sort(cust ,new SortBased_on_DOB());
		for(Customer c : cust){
			System.out.println(c.getDob());
		}
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}

class SortBased_on_DOB implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {		
		return 0;
	}
	
}
