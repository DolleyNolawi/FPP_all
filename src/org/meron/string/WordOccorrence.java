package org.meron.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOccorrence {
	
	//count words
	public static int countWords(String str){
		String newstr = str.trim();
		System.out.println(newstr);
		if(newstr.isEmpty()) return 0;
		return newstr.split("\\s+").length;
	}

	public static void main(String[] args) {
		String s = "Nolawi is my boy. Nolawi is good boy";
		
		Pattern p = Pattern.compile("Nolawi");
		Matcher m = p.matcher(s);
		int i = 0;
		while(m.find()){
			i++;
		}
		System.out.println(i);
		
		System.out.println(countWords(s));

	}

}
