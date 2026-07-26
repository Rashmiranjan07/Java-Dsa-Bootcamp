//Reverse an array

package c05_arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 23, 9, 18 };
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			// swap
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
