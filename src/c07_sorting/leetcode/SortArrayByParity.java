/*905. Sort Array By Parity (easy)
 ---------------------------------
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:
Input: nums = [0]
Output: [0]
 
 */

package c07_sorting.leetcode;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 5, 4, 2 };

		System.out.println(Arrays.toString(sortArrayByParity(arr)));
	}

	public static int[] sortArrayByParity(int[] nums) {

		// Selection sort
		for (int i = 0; i < nums.length; i++) {

			int last = nums.length - i - 1;

			int maxIndex = getMaxIndex(nums, 0, last);

			swap(nums, maxIndex, last);
		}

		// Put even numbers first
		int[] newArr = new int[nums.length];

		int index = 0;

		// First put even numbers
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				newArr[index] = nums[i];
				index++;
			}
		}

		// Then put odd numbers
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {
				newArr[index] = nums[i];
				index++;
			}
		}

		return newArr;
	}

	static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static int getMaxIndex(int[] arr, int start, int end) {

		int max = start;

		for (int i = start; i <= end; i++) {

			if (arr[max] < arr[i]) {
				max = i;
			}
		}

		return max;
	}
}



/*
 * even in this question we do not needed the sorting we can simply add the even
 * numbers first and odd numbers last
 * 
 * public static int[] sortArrayByParity(int[] nums) {
 * 
 * int index = 0;
 * 
 * for (int i = 0; i < nums.length; i++) {
 * 
 * if (nums[i] % 2 == 0) { swap(nums, i, index); index++; } }
 * 
 * return nums; }
 */
