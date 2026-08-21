/* 1200. Minimum absolute difference (easy)
 *-----------------------------------------
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr

Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
Example 2:

Input: arr = [1,3,6,10,15]
Output: [[1,3]]
Example 3:

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]
 

 */


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