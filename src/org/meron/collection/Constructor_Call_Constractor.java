package org.meron.collection;

public class Constructor_Call_Constractor {
	
	int age;
	String name;
	
	public Constructor_Call_Constractor(){
	   Constructor_Call_Constractor con = new Constructor_Call_Constractor(7, "h");
	}

	public Constructor_Call_Constractor(int age, String name) {
		this.age = age;
		this.name = name;
	}


	public static void main(String[] args) {
		
	}

}
