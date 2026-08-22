/* 922. Sort Array By Parity II
 *-----------------------------
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Example 2:
Input: nums = [2,3]
Output: [2,3]

 */

package c07_sorting.leetcode;

import java.util.Arrays;

public class SortArrayByParityII {
	public static void main(String[] args) {

		int[] nums = { 4, 2, 5, 7 };
		sortArrayByParityII(nums);
		System.out.println(Arrays.toString(nums));

	}

	static public int[] sortArrayByParityII(int[] nums) {

		int[] newArr = new int[nums.length];

		// int index = 0;
		int evenIndex = 0;
		int oddIndex = 1;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				newArr[evenIndex] = nums[i];
				evenIndex += 2;

			} else {
				newArr[oddIndex] = nums[i];
				oddIndex += 2;
			}

		}

		return newArr;

	}

}
