/* 287. Find the Duplicate Number (medium)
 *----------------------------------------
 *Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3

 */


package c07_sorting.leetcode;

public class FindDuplicateNum {
	public static void main(String[] args) {
		int [] nums= {};

	}

	public int findDuplicate(int[] nums) {
		for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
		// Arrays.sort(nums);

		int element = nums[0];

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				element = nums[i];
			}
		}

		return element;

	}

}
