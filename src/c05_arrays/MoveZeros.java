/* 283. Move Zeroes (Easy)
  -----------------------
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

 */

package c05_arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
	}

	public void moveZeroes(int[] nums) {
		
		   int index = 0;

	        // Put all non-zero elements at the front
	        for (int num : nums) {
	            if (num != 0) {
	                nums[index] = num;
	                index++;
	            }
	        }

	}

}
