//Bubble Sort by recursion:-

package c10_recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 5 };
		bubble(arr, arr.length - 1, 0);
		System.out.println(Arrays.toString(arr));
	}

	static void bubble(int[] arr, int r, int c) {

		// Base condition
		if (r == 0) {
			return;
		}

		// Compare adjacent elements
		if (c < r) {

			if (arr[c] > arr[c + 1]) {
				// swap
				int temp = arr[c];
				arr[c] = arr[c + 1];
				arr[c + 1] = temp;
			}

			// Move to next pair
			bubble(arr, r, c + 1);

		} else {

			// One pass completed, reduce the range
			bubble(arr, r - 1, 0);
		}
	}
}