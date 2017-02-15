package org.meron.string;

import java.util.ArrayList;
import java.util.List;

public class Stringtest {	
	
	public static void main(String[] args) {
		
		String hello = "wel-com-e";
		String hello1 = "welcome";
		String hello4 = new String("Using new key word");
		
		String y = "444";
		int x = Integer.parseInt(y);
		System.out.println(x);
		String reuse = hello4;
		
		String[] hello3 = hello.split("-");
		String hello2 = new StringBuffer(hello1).reverse().toString();
		
		List<Object> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("this is sub list " + list.subList(0, 1));
		
		System.out.println(hello2);
		
		System.out.println("hello " + hello.hashCode());
		System.out.println(hello3.equals(hello2));
	}

}
