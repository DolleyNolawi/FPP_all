package org.meron.collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Iterate {

	public static void main(String[] args) {
		HashMap<Integer, String> list = new HashMap<>();
		list.put(1, "Meron");
		list.put(2, "hagose");
		list.put(3, "Abel");
		
		//if need only key
		for(Integer i : list.keySet()){
			System.out.println(i);
		}
		//if only values is needed
		for(String s : list.values()){
			System.out.println(s);
		}
		//for both
		for(Map.Entry<Integer, String> entry : list.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
		
	}

}
