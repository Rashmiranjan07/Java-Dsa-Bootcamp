/* 189. Rotate Array (Medium)
------------------------------
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

 */

package c05_arrays;

public class RotateArray {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		RotateArray obj = new RotateArray();
		obj.rotate(nums, k);

		// Print result
		for (int x : nums) {
			System.out.print(x + " ");
		}
	}

	public void rotate(int[] nums, int k) {
// this way we get time limit exceed 
//		for (int r = 1; r <= k; r++) {
//
//			int last = nums[nums.length - 1];
//
//			for (int i = nums.length - 1; i > 0; i--) {
//				nums[i] = nums[i - 1];
//			}
//
//			nums[0] = last;
//		}
//
//		for (int x : nums) {
//			System.out.print(x + " ");
//		}

		int n = nums.length;
		
		if (n == 0) {
			return;
		}
		
		k = k % n;

		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	private void reverse(int[] nums, int left, int right) {
		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;

			left++;
			right--;
		}

	}

}
