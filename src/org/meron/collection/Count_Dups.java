package org.meron.collection;

import java.util.HashMap;
import java.util.Map;

public class Count_Dups {
	
	public Map<Character, Integer> countdups(String str){
		
		Map<Character, Integer> newStr = new HashMap<Character, Integer>();
		
		for(int i=0 ; i < str.length() ; i++){
			char charStr = str.charAt(i);
			//int count = newStr.containsKey(""+charStr)? newStr.get(charStr) : 0;
			if(newStr.containsKey(charStr)){
				newStr.put(charStr, newStr.get(charStr)+1);	
				
			}else{
				newStr.put(charStr, 1);
			}			
		}			
		return newStr;
	}

	public static void main(String[] args) {
		String str= "aabbc";
		Count_Dups dups = new Count_Dups();
		System.out.println(dups.countdups(str));
	}

}
