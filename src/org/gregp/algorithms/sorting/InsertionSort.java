package org.gregp.algorithms.sorting;

public class InsertionSort implements SortingAlgorithm {

	// 5, \6\, 4, 3, 2
	// 5, 6, \4\, 3, 2
	// 4, 5, 6, \3\, 2
	// 3, 4, 5, 6, \2\
	// 2, 3, 4, 5, 6
//	public Integer[] sort(Integer[] values) {
//		for(int i = 1; i < values.length; i++) {
//			int value = values[i];
//			int j = i - 1;
//			while(j >= 0 && values[j] > value){
//				values[j + 1] = values[j];
//				printArray(values);
//			    j--;
//			}
//			values[j + 1] = value;
//			printArray(values);
//		} 
//		return values;
//	}
	
	public Integer[] sort(Integer[] values) {
		for(int i = 1; i < values.length; i++) {
			for(int j = 0; j < i + 1; j++) {
				int value = values[i];
				if(value < values[j]) {
					values[i] = values[j];
					values[j] = value;
				}
				printArray(values);
			}
		} 
		return values;
	}
	
	public void printArray(Integer[] values) {
		for(Integer value : values) {
			System.out.print(value + ", ");
		}
		System.out.println();
	}

}
