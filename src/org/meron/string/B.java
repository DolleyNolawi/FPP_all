package org.meron.string;

class A {
	public void x() {

	}

	protected void x2() {

	}

	//can not call the private from the main in class b 
	private void x3() {

	}

	void x4() {

	}
}

public class B implements Bnew , Cnew{

	public static void main(String[] args) {
		B b = new B();
		b.m();

	}

}
