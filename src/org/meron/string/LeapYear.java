package org.meron.string;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapYear {
	
	public boolean isLeapYEar(int year){
		Calendar cal = Calendar.getInstance();		
		cal.set(Calendar.YEAR, year);
		int days= cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		return (days > 365);
	}

	
	public static void main(String[] args) {
		LeapYear leap = new LeapYear();
		boolean x = leap.isLeapYEar(1914);
		System.out.println(x);
		
		//2 option
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.isLeapYear(2020));
		
	
		
	}

}
