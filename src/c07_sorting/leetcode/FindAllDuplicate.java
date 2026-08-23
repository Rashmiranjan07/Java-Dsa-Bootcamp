/* 442. Find All Duplicates in an Array (medium) ( Goggle & Amazon )
 --------------------------------------------------------------------
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: nums = [1,1,2]
Output: [1]

Example 3:
Input: nums = [1]
Output: []
 */

package c07_sorting.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		FindAllDuplicate obj = new FindAllDuplicate();
		List<Integer> result = obj.findDuplicates(nums);
		System.out.println(result);

	}

	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> ans = new ArrayList<>();

		int i = 0;

		while (i < nums.length) {
			int correct = nums[i] - 1;

			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}

		// Find numbers that are not at their correct index
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				ans.add(nums[index]);
			}
		}

		return ans;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}