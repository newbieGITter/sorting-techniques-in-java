package com.devon.selectionsort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

	private SelectionSort selectionSort;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		selectionSort = new SelectionSort();
	}

	@Test
	public void test() {
		int[] inputArray = {11, 33, 22, 44, 66, 55, 9};
		
		int[] sortedNumbers = selectionSort.sortNumbers(inputArray);
	
		Assert.assertEquals(9, sortedNumbers[0]);
		Assert.assertEquals(11, sortedNumbers[1]);
		Assert.assertEquals(66, sortedNumbers[sortedNumbers.length-1]); // last element
		
		for (int i = 0; i < sortedNumbers.length; i++) {
			System.out.println(sortedNumbers[i] + " ");
		}
	}

}
