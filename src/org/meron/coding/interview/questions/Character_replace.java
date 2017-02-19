package org.meron.coding.interview.questions;


/*
 * Meron Abrha
 * 
 * Write a Java program to replace certain characters from String 
 * */
public class Character_replace {
	
	public String replace(String str , char ch){
		
		for(int i=0 ; i < str.length() ; i++){
			if(str.charAt(i) == ch){
				str = str.substring(0, i) + 'Q' + str.substring(i+1);				
			}
		}
		
		return str.substring(0);
	}
	
	public String reverseString(String str){
		int len = str.length();
		String newString = "";
		for( int i =len-1 ; i>= 0 ; i --){
			newString += str.charAt(i);
		}
		return newString;
	}	
	

	public static void main(String[] args) {
		String mystr = "hello peoples of Ethiopia!";
		Character_replace replace = new Character_replace();
		String value = replace.replace(mystr, 'o');
		
		String reverse = replace.reverseString(mystr);
		System.out.println(value);
		System.out.println(reverse);
	}

}
