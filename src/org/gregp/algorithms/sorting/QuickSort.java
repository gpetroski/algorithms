package org.gregp.algorithms.sorting;

public class QuickSort implements SortingAlgorithm {

	public Integer[] sort(Integer[] values) {
		quickSort(values, 0, values.length - 1);
		return values;
	}
	
	public void quickSort(Integer[] values, int start, int end) {
		int s = start;
		int e = end;
		
		int pi = (s + e)/2;
		int pivot = values[pi];
		
		while(s < e) {
			while(values[s] < pivot) {
				s++;
			}
			while(values[e] > pivot) {
				e--;
			}
			if(s < e) {
				int temp = values[s];
				values[s] = values[e];
				values[e] = temp;
				printArray(values);
			}
			s++;
			e--;
		}
		if(start < e) {
			quickSort(values, start, e);
		}
		if(s < end) {
			quickSort(values, s, end);
		}
	}
	
	public void printArray(Integer[] values) {
		for(Integer value : values) {
			System.out.print(value + ", ");
		}
		System.out.println();
	}

}
