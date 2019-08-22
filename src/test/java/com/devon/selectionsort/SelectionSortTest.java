package com.devon.selectionsort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

	private SelectionSort bubbleSort;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		bubbleSort = new SelectionSort();
	}

	@Test
	public void test() {
		int[] inputArray = {11, 33, 22, 44, 66, 55, 9};
		
		int[] sortedNumbers = bubbleSort.sortNumbers(inputArray);
	
		Assert.assertEquals(9, sortedNumbers[0]);
		Assert.assertEquals(11, sortedNumbers[1]);
		Assert.assertEquals(66, sortedNumbers[sortedNumbers.length-1]); // last element
		
		for (int i = 0; i < sortedNumbers.length; i++) {
			System.out.println(sortedNumbers[i] + " ");
		}
	}

}
