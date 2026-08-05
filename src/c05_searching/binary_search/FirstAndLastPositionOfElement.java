/* Find the first and last element of a sorted array
 * -------------------------------------------------
 Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
 
 */

package c05_searching.binary_search;

import java.util.ArrayList;

public class FirstAndLastPositionOfElement {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

	}

	public int[] searchRange(int[] nums, int target) {

		int[] ans = { -1, -1 };
		// check for first occurrence if target first
		ans[0] = search(nums, target, true);
		if (ans[0] != -1) {
			ans[1] = search(nums, target, false);
		}
		return ans;
	}

	// this function just returns the index value of target
	int search(int[] nums, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			// find the middle element
//	            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				// potential ans found
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
