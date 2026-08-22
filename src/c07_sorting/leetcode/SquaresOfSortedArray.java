/* 977.Squares of Sorted array ( easy)
 *---------------------------------------
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

 */

package c07_sorting.leetcode;

import java.util.Arrays;

public class SquaresOfSortedArray {
	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		SquaresOfSortedArray obj = new SquaresOfSortedArray();
		int[] result = obj.sortedSquares(nums);
		System.out.println(Arrays.toString(result));

	}

	public int[] sortedSquares(int[] nums) {

		int n = nums.length;
		int[] square = new int[n];

		for (int i = 0; i < nums.length; i++) {
			square[i] = nums[i] * nums[i];
		}

		for (int i = 0; i < square.length; i++) {
			for (int j = 1; j < n - 1; j++) {
				if (square[j] < square[j - 1]) {
					int temp = square[j];
					square[j] = square[j - 1];
					square[j - 1] = temp;
				}
			}
		}

		return square;

	}

}
