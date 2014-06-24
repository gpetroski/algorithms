package org.gregp.algorithms.sorting;

public class SelectSort implements SortingAlgorithm {

	// 5, 4, 6, 2, 1
	// 1, 4, 6, 2, 5
	// 1, 2, 6, 4, 5
	// 1, 2, 4, 6, 5
	// 1, 2, 4, 5, 6
	// Upper o(n^2)
	// Lower w(n^2)
	public Integer[] sort(Integer[] values) {
		for(int n = 0; n < values.length - 1; n++) {
			int min = values[n];
			int mini = n;
			for(int j = n + 1; j < values.length; j++) {
				if(min > values[j]) {
					min = values[j];
					mini = j; 
				}
			}
			values[mini] = values[n];
			values[n] = min;
		}
		return values;
	}

}
