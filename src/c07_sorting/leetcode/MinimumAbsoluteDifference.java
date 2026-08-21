package c07_sorting.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 1, 3 };

		MinimumAbsoluteDifference obj = new MinimumAbsoluteDifference();

		List<List<Integer>> answer = obj.minimumAbsDifference(arr);

		System.out.println(answer);
	}

	public List<List<Integer>> minimumAbsDifference(int[] arr) {

		// Step 1: Sort the array by Bubble Sort
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// Step 2: Find the minimum difference
		int minDiff = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 1; i++) {

			int diff = arr[i + 1] - arr[i];

			if (diff < minDiff) {
				minDiff = diff;
			}
		}

		// Step 3: Store all pairs having minimum difference
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i + 1] - arr[i] == minDiff) {

				result.add(List.of(arr[i], arr[i + 1]));
			}
		}

		return result;
	}
}