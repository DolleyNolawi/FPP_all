package org.meron.exception;
/*
 * if we try to cast Integer (any wrapper class) into 
 * String it will raise CassCastException
 * */
public class Class_Cast_Exception {

	public static void main(String[] args) {
		Object y =  new Integer(0);
		System.out.println((String) y);
	}

}
