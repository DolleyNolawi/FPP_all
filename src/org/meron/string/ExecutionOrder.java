package org.meron.string;

public class ExecutionOrder {
	
	public static int count;
	static{
		System.out.println("in b1");
		count = 10;
	}
	private int[] data;
	{
		System.out.println("in b2");
		data = new int[count];
		for(int i=0; i< count; i++){
			data[i] = i;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("count = " + count);
		System.out.println("before 1st call");
		ExecutionOrder test1 = new ExecutionOrder();
		System.out.println("before 2nd call");
		ExecutionOrder test2 = new ExecutionOrder();
	}

}
