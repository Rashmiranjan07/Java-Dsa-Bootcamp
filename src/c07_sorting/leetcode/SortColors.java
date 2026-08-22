/* 75. Sort Colors ( medium )
  ----------------------------
You are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Explanation:
The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
Explanation:
The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

 */

package c07_sorting.leetcode;

import java.util.Arrays;

public class SortColors {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		SortColors obj = new SortColors();
		obj.sortColors(nums);
		System.out.println(Arrays.toString(nums));

	}

	public void sortColors(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = 1; j < nums.length - i; j++) {

				if (nums[j] < nums[j - 1]) {

					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}

	}

}
