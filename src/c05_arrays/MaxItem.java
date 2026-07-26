package c05_arrays;

import java.util.Arrays;

public class MaxItem {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 23, 9, 18 };
		System.out.println("the maximum value is " + isMax(arr));

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
