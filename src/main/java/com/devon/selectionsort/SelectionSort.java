package com.devon.selectionsort;

public class SelectionSort {

	public int[] sortNumbers(final int[] inputArray) {
		
		for (int i = 0; i < inputArray.length; i++) {
			
			int min = i;
			int temp = 0;
			for (int j = i+1; j < inputArray.length; j++) {
				
				if(inputArray[j] < inputArray[min]) {
					min = j;
				}
			}
			temp = inputArray[i];
			inputArray[i] = inputArray[min];
			inputArray[min] = temp;
		}
		return inputArray;

	}
}