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
    	
    	int len = s.length(), k=0 , num = 0 , j=0 , q = 3;
    	boolean flag = false;
    	if(s.length() < 3) return -1;  
    	for(int i = 0 ; i < len ; i++){
    		if(s.charAt(i) == '1'){
    			num += Math.pow(2, (len-1) -i);
    			flag = true;
    		}
    	}
    	
    	//if all the input is zero
    	if(!flag) return -1;
    	System.out.println("The int representation is:  "+ num);
    	
    	while(num >= 5){
    		if(num == 5) return 1;
    		else if(num % 5 != 0) break;
    		num /= 5;
    	}
    	//try to find if it can be split into diff binary five representations
       	if(len%3 != 0) return -1;
    	while(len >= 3){    		
    		if(s.substring(j , q).equals("101")){
    			j += 3;
    			q += 3;
    			len -= 3;
    			k++;
    		}
    		
    		else return -1;
    		
    	}
    	
    	return k;
    }
    public static void main(String args[]){
    	String s1 = "101";
    	String s2 = "11001";
    	String s3 ="1111101";
    	
    	String s4 = "000000";
    	
    	String s5 = "101101101";
    	
    	Solution sol = new Solution();
    	int result = sol.getMin(s5);
    	System.out.println(result);
    }



}