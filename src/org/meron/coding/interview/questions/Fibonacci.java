package org.meron.coding.interview.questions;

public class Fibonacci {
	int first = 1, second =1 , sum = 0;
	
	public int fibonacci_sum(int value){		
		
		while(sum < value){		
			sum = first + second;
			
			if(sum > value){
				return sum - (first);
			}else{
				first = second;
				second = sum;
			}			
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		int sum = fib.fibonacci_sum(100);
		System.out.println(sum);

	}

}
