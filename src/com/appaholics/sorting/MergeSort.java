package com.appaholics.sorting;

/**
 * @author Raghav Sood
 * @version 1
 * 
 * Implementation of the MergeSort algorithm
 *
 */
public class MergeSort {
	public static void main(String a[]) {
		int i;
		int array[] = { 12, 9, 4, 99, 120, 1, 3, 10 };

		System.out.println("Values Before the sort:\n");
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		
		System.out.println();
		mergeSort(array, 0, array.length - 1);
		
		System.out.print("Values after the sort:\n");
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		
		System.out.println();
	}

	public static void mergeSort(int array[], int lo, int n) {
		int low = lo;
		int high = n;
		if (low >= high) {
			return;
		}

		int middle = (low + high) / 2;
		mergeSort(array, low, middle);
		mergeSort(array, middle + 1, high);
		int end_low = middle;
		int start_high = middle + 1;
		while ((lo <= end_low) && (start_high <= high)) {
			if (array[low] < array[start_high]) {
				low++;
			} else {
				int Temp = array[start_high];
				for (int k = start_high - 1; k >= low; k--) {
					array[k + 1] = array[k];
				}
				array[low] = Temp;
				low++;
				end_low++;
				start_high++;
			}
		}
	}
}