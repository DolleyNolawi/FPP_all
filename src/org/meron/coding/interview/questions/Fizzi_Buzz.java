package org.meron.coding.interview.questions;

import java.util.Random;

public class Fizzi_Buzz {
	
	public String decide_if_buzz(int random){
		System.out.println(random);
		if(random % 3 == 0 && random % 5 == 0){
			return "FizzBuzz";
		}else if(random % 3 == 0){
			return "Fizz";
		}else  if(random % 5 == 0){
			return "Buzz";
		}else{
			return "";
		}		
	}

	public static void main(String[] args) {
		Random r = new Random();
		int myrandom = r.nextInt(50);
		Fizzi_Buzz fiz = new Fizzi_Buzz();
		String get = fiz.decide_if_buzz(myrandom);
		System.out.println(get);
	}

}
