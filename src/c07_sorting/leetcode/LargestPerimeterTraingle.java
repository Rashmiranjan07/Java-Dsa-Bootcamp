/* 976. Largest Perimeter Triangle ( easy )
 -------------------------------------------
 Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
 
Example 1:
Input: nums = [2,1,2]
Output: 5
Explanation: You can form a triangle with three side lengths: 1, 2, and 2.

Example 2:
Input: nums = [1,2,1,10]
Output: 0
Explanation: 
You cannot use the side lengths 1, 1, and 2 to form a triangle.
You cannot use the side lengths 1, 1, and 10 to form a triangle.
You cannot use the side lengths 1, 2, and 10 to form a triangle.
As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.

 */


package c07_sorting.leetcode;

import java.util.Arrays;

public class LargestPerimeterTraingle {
	public static void main(String[] args) {
		int[] nums = { 1,2,1,10};
		LargestPerimeterTraingle obj = new LargestPerimeterTraingle();
		int result = obj.largestPerimeter(nums);
		System.out.println(result);

	}

	public int largestPerimeter(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}

		for (int i = nums.length - 1; i >= 2; i--) {
			if (nums[i - 2] + nums[i - 1] > nums[i]) {
				return nums[i - 2] + nums[i - 1] + nums[i];
			}
		}
		return 0;

	}

}
