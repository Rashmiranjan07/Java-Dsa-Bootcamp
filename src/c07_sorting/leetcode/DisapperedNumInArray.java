/* 448. Find All Numbers Disappeared in an Array ( easy ) ( Asked in Goggle )
 ----------------------------------------------------------------------------
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
 */

package c07_sorting.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisapperedNumInArray {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		DisapperedNumInArray obj = new DisapperedNumInArray();
		List<Integer> result = obj.findDisappearedNumbers(nums);
		System.out.println(result);

	}

	public List<Integer> findDisappearedNumbers(int[] nums) {

		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}

		// just find missing numbers
		List<Integer> ans = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				ans.add(index + 1);
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


/*
 * Tips :-
 *  ------- 
 *  1. If range =[0 - n] evry element will be at index=value 
 *  2. If range = [1,n] every element will be at index=value-1
 */
