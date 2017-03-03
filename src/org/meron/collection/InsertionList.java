package org.meron.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionList {

	public static void main(String[] args) {
		
		//list maintains the insertion order if we don't
		//specify the position to insert it will add it at the last 
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.set(0, 7);
		for(int l : list){
			System.out.print(l);
		}
		System.out.println();
		// reverse sort
		Collections.sort(list , Collections.reverseOrder());
		
		for(int l : list){
			System.out.print(l);
		}
	}

}
