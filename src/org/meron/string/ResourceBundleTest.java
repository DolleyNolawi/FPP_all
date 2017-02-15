package org.meron.string;

public class ResourceBundleTest {

	public static void main(String[] args) {
		Long l = new Long(1234);
		Long ll = (long) 1234;
		
		if(l == ll) System.out.println("Equal -");
		else System.out.println("Not Equal -");
		l++;
		if(l == ll) System.out.println("Equal -");
		else System.out.println("Not Equal -");

	}

}
