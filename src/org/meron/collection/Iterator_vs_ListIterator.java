package org.meron.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_vs_ListIterator {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("meron" , "hagose");
		List<String> list2 = Arrays.asList("Kb" , "Teku");
		
		ListIterator<String> iter = null;
		Iterator<String> iter1 = null;
		
				
		iter = list.listIterator();
		iter1 = list2.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		while(iter1.hasNext()){
			System.out.println(iter1.next());
		}

	}

}
