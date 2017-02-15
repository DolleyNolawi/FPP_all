package org.meron.algorithm;

public class BinaryRepresentation {
	
	//method that takes integer input and returns its binary representation
	public String intToBinary(Integer input){
		
		return Integer.toBinaryString(input);
	}

	public static void main(String[] args) {
		BinaryRepresentation binary = new BinaryRepresentation();
		System.out.println(binary.intToBinary(7));
	}

}
