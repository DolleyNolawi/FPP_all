package org.meron.coding.interview.questions.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.meron.coding.interview.questions.Fibonacci;

public class Test_Fibonacci {

	@Test
	public void test() {
		int given = 5;
		Fibonacci fib = new Fibonacci();
		
		assertEquals(5 , fib.fibonacci_sum(given));
	}

}
