// Cycle Sort - if the array elements is from 1-n , then we use this approach .

package c07_sorting.cycle_sort;

import java.util.Arrays;

public class CycleSort {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 1, 4 };
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	// starts with i and move it its correct index/position
	// check - swap - move

	static void cycleSort(int[] arr) {
		// starts with i and move it its correct index/position
		// check - swap - move

		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1; // correct index= value-1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
