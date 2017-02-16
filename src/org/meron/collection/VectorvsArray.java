package org.meron.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class VectorvsArray {

	public static void main(String[] args) {
		Vector<Integer> x = new Vector<>();
		//int[] a = new int[4];	
		Set<Integer> set = new HashSet<>();
		
		List<Integer> list = new LinkedList<>();
		
		for(int i =0; i < 5; i++){
			x.addElement(i);
			set.add(i);
			list.add(i);
		}
		for(int i =0; i < 5; i++){ 
			x.addElement(i);
			set.add(i);
			list.add(i);
		}
		list.set(0, 6);
		for(Integer j : set){
			System.out.print(j.toString() + ", ");
		}
		System.out.println();
		for(Integer j : list){
			System.out.print(j.toString() + ", ");
		}
		
	}

}
