/* 153. Find Minimum in Rotated Sorted Array (medium)
  --------------------------------------------------
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:
Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:
Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.   

 */

package c06_searching.binary_search;

public class MinimumInRotatedSortedArray {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 1, 2 };
		MinimumInRotatedSortedArray obj = new MinimumInRotatedSortedArray();
		int result = obj.findMin(nums);
		System.out.println(result);

	}

// Another and easiest way & simple binary Search
	public int findMin(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (nums[mid] > nums[end]) {
				// Minimum is on the right
				start = mid + 1;
			} else {
				// Minimum is at mid or on the left
				end = mid;
			}
		}

		return nums[start];
	}
}

// this method helps by finding pivot 

//	public int findMin(int[] nums) {
//		int pivot = findPivot(nums);
//		if (pivot == -1) {
//			// Array is not rotated
//			return nums[0];
//		}
//
//		return nums[pivot + 1];
//
//	}
//
//	static int findPivot(int[] nums) {
//
//		int start = 0;
//		int end = nums.length - 1;
//		while (start <= end) {
//			int mid = start + (end - start) / 2;
//			if (mid < end && nums[mid] > nums[mid + 1]) {
//				return mid;
//			}
//			if (mid > start && nums[mid] < nums[mid - 1]) {
//				return mid - 1;
//			}
//			if (nums[mid] <= nums[start]) {
//				end = mid - 1;
//			} else {
//				start = mid + 1;
//			}
//		}
//		return -1;
//	}
