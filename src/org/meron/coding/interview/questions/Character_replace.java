package org.meron.coding.interview.questions;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Meron Abrha
 * 
 * Write a Java program to replace certain characters from String 
 * */
public class Character_replace {
	
	public String replace(String str , char ch){
		char str2 = str.charAt(0);
		str2 = ch;
		return str2 + str.substring(1);
	}
	
	public String reverseString(String str){
		int len = str.length();
		String newString = "";
		for( int i =len-1 ; i>= 0 ; i --){
			newString += str.charAt(i);
		}
		return newString;
	}
	
	@Test
	public void Test(){
		Character_replace reverse = new Character_replace();
		
		String given = "hello";
		String expected = "olleh";
		String obtained = reverse.reverseString(given);
		assertEquals(expected, obtained);
	}

	public static void main(String[] args) {
		String mystr = "hello peoples of Ethiopia!";
		Character_replace replace = new Character_replace();
		String value = replace.replace(mystr, 'w');
		String reverse = replace.reverseString(mystr);
		System.out.println(value);
		System.out.println(reverse);
	}

}
