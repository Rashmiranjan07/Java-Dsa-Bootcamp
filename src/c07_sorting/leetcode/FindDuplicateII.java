/* 287. Find the Duplicate Number (medium) (amazon)
 --------------------------------------------------
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
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

public class FindDuplicateII {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		FindDuplicateNum obj = new FindDuplicateNum();
		int result = obj.findDuplicate(nums);
		System.out.println(result);

	}

	public int findDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1; // correct index= value-1;
			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}
		int element = nums[0];

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == nums[j + 1]) {
				element = nums[j];
			}
		}

		return element;

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
