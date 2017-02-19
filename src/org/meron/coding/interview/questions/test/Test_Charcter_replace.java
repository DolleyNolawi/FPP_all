package org.meron.coding.interview.questions.test;

import static org.junit.Assert.*;


import org.meron.coding.interview.questions.Character_replace;

public class Test_Charcter_replace {

	Character_replace reverse = new Character_replace();
	
	@org.junit.Test
	public void test_String_Reverse() {		
		
		String given = "hello";
		String expected = "olleh";
		String obtained = reverse.reverseString(given);
		assertEquals(expected, obtained);
	}
	
	@org.junit.Test
	public void test_replace_function(){
		String given = "hello";
		char given2 = 'l';
		String expected = "heQQo";
		String obtained = reverse.replace(given, given2);
		assertEquals(expected , obtained);
	}
	


}
