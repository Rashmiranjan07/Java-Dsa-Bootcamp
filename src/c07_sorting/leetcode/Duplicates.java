/*217. Contains Duplicates (easy)
 --------------------------
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 */



package c07_sorting.leetcode;

public class Duplicates {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 2 };
		Duplicates obj = new Duplicates();
		boolean result = obj.containsDuplicate(nums);
		System.out.println(result);

	}

	public boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

}
