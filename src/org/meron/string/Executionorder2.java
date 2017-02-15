package org.meron.string;

public class Executionorder2 {

	private int data;

	public Executionorder2() {
		this(10);
	}

	public Executionorder2(int data) {
		this.data = data;
	}

	public void display() {
		class Decrementer {
			public void decrementer() {
				data--;
			}
		}
		Decrementer d = new Decrementer();
		d.decrementer();
		System.out.println("data = " + data);
	}

	public static void main(String[] args) {
		int data = 0;
		Executionorder2 a = new Executionorder2();
		a.display();
		System.out.println("data = " + data);
	}

}
