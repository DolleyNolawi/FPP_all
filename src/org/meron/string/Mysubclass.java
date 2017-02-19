package org.meron.string;

public class Mysubclass extends CastingObject {

	public void print(){
		System.out.println("this SUB class");
	}
	
	public static void main(String[] args) {
		CastingObject obj = new Mysubclass();
		((Mysubclass)obj).print();
	}

}
