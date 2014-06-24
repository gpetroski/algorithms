package org.gregp.algorithms.sorting;

public class BubbleSort implements SortingAlgorithm {

	// Upper O(n^2)
	// Lower O(n)
	// Memory O(1)
	public Integer[] sort(Integer[] values) {
		for(int n = 0; n < values.length; n++) {
			for(int i = 0; i < values.length - 1; i++) {
				int first = values[i];
				int second = values[i + 1];
				if(first > second) {
					values[i] = second;
					values[i+1] = first;
				}
			}
		}
		return values;
	}
}