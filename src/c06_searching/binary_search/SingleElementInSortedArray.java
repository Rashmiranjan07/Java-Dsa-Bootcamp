/*540. Single Element in a Sorted Array ( medium )
----------------------------------------
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10

 */

package c06_searching.binary_search;

public class SingleElementInSortedArray {
	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 2, 3, 4, 4, 8, 8 };

		SingleElementInSortedArray obj = new SingleElementInSortedArray();
		int result = obj.singleNonDuplicate(nums);
		System.out.println(result);

	}

	public int singleNonDuplicate(int[] nums) {

		int start = 0;
		int n = nums.length - 1;
		int end = n;

		// Only one element
		if (nums.length == 1)
			return nums[0];

		while (start <= end) {

			int mid = start + (end - start) / 2;

			// First element
			if (mid == 0 && nums[0] != nums[1])
				return nums[mid];

			// Last element
			if (mid == n && nums[n - 1] != nums[n])
				return nums[mid];

			// Single element is in the middle
			if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
				return nums[mid];
			}

			// mid is even
			if (mid % 2 == 0) {

				if (nums[mid - 1] == nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

				// mid is odd
			} else {

				if (nums[mid - 1] == nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}

		return -1;
	}
}
