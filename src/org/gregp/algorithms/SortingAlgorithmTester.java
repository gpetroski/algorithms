package org.gregp.algorithms;

import org.gregp.algorithms.sorting.BubbleSort;
import org.gregp.algorithms.sorting.InsertionSort;
import org.gregp.algorithms.sorting.SelectSort;
import org.gregp.algorithms.sorting.SortingAlgorithm;

public class SortingAlgorithmTester {
	public static void main(String[] args) {
		//testAlgorithm(new BubbleSort());
		//testAlgorithm(new SelectSort());	
		testAlgorithm(new InsertionSort());		
	}
	
	public static void testAlgorithm(SortingAlgorithm sortAlg) {		
		Integer[] input1 = {5,6,9,2,1};
		printArray(sortAlg.sort(input1)); // 1, 2, 5, 6, 9
		
		Integer[] input2 = {100,99,98,97,1};
		printArray(sortAlg.sort(input2)); // 1, 97, 98, 99, 100
		
		Integer[] input3 = {1,2,3,4,5};
		printArray(sortAlg.sort(input3)); // 1, 2, 3, 4, 5
		
		Integer[] input4 = {5, 4, 5, 4, 5, 4};
		printArray(sortAlg.sort(input4)); // 4, 4, 4, 5, 5, 5		
	}
	
	public static void printArray(Integer[] values) {
		for(Integer value : values) {
			System.out.print(value + ", ");
		}
		System.out.println();
	}
}