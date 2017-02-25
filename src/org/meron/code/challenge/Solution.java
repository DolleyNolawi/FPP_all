package org.meron.code.challenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public Solution(){
    }

    public int getMin(String s){
    	
    	int len = s.length(), k=0 , num = 0;
    	if(s.length() < 3) return -1;  
    	for(int i = 0 ; i < len ; i++){
    		if(s.charAt(i) == '1'){
    			num += Math.pow(2, (len-1) -i);
    		}
    	}
    	System.out.println("The int representation is:  "+ num);
    	
    	while(num >= 5){
    		if(num == 5) return 1;
    		else if(num % 5 != 0) break;
    		num /= 5;
    	}
    	//try to find if it can be split into diff binary five representations
    	
    	return 0;
    }
    public static void main(String args[]){
    	String s1 = "101";
    	String s2 = "11001";
    	String s3 ="1111101";
    	Solution sol = new Solution();
    	int result = sol.getMin(s3);
    	System.out.println(result);
    }



}