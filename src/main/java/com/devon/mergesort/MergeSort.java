package com.devon.mergesort;

public class MergeSort {
	
	private int[] numbers;
	private int[] helper;
	private int length;
	
	public void sort(int[] numbers) {
		this.numbers = numbers;
		length = numbers.length;
		this.helper = new int[length];
		
		divideArray(0, length-1);
	}

	private void divideArray(int low, int high) {
		
		if(low < high) {
			int middle = low + (high - low) / 2;
			
			// Sort the left side of the array
			divideArray(low, middle);
			
			// Sort the right side of the array
			divideArray(middle+1, high);
			
			// Merge them both
			merge(low, middle, high);
		}
		
	}

	private void merge(int low, int middle, int high) {
		// Copy both parts of the array
		for(int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}
		
		int i = low;
		int j = middle+1;
		int k = low;
		
		 // Copy the smallest values from either the left or the right side back
        // to the original array
		while(i <= middle && j <= high) {
			if(helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} 
			else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		
		// Copy the rest of the left side of the array into result array
		while(i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
		
		// Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.
	}

}
