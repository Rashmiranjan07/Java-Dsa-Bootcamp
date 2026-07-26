//Find the max item inside an array 

package c05_arrays;

import java.util.Arrays;

public class MaxItem {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 23, 9, 18 };
		System.out.println("the maximum value is " + isMax(arr));
		System.out.println("the maximum value in between the range is  " + maxRange(arr, 1, 3));
	}

	// FOund the maximum item in a range
	static int maxRange(int[] arr, int start, int end) {
		int maxVal = arr[0];
		for (int i = start; i <= end; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;

	}

	static int isMax(int[] arr) {
		int maxVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;

	}

}
