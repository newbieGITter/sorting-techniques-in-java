package com.devon.bubblesort;

public class BubbleSort {

	public int[] sortNumbers(final int[] inputArray) {
		
		for (int i = 0; i < inputArray.length; i++) {
			
			int flag = 0;
			for (int j = 0; j < inputArray.length - 1 - i; j++) {
				int temp = 0;

				if (inputArray[j] > inputArray[j + 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
					flag = 1;
				}
			}
			
			if (flag == 0) {
				break;
			}
		}
		return inputArray;

	}
}