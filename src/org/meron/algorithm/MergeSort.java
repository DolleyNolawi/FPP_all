package org.meron.algorithm;

public class MergeSort {

	public void mergeSort(int[] inputs){
		int n = inputs.length;
		
		if(n > 2) {		
			int mid = n / 2;
			int[] left = new int[mid];
			int[] right = new int[n - mid];
			
			for(int i = 0; i < mid ; i++){
				left[i] = inputs[i];
			}
			for(int i = mid ; i < right.length ; i++){
				right[i] = inputs[i];
			}			
			mergeSort(left);
			mergeSort(right);
			merge(left , right , inputs);	
		}		
			
	}
	
	public void merge(int[] left, int[] right,int[] result){
		while(left.length > 0 && right.length > 0){
			int i =0 , j = 0 , k = 0;
			if(left[i] >= right[j]){
				result[k] = right[j];
				j++;
				k++;
			}else{
				result[k] = left[i];
				i++;
				k++;				
			}
			
		}
		
		for(Object i : result){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int[] values = {5, 2, 6, 7,1,4};
		MergeSort m = new MergeSort();
		m.mergeSort(values);
	}

}
