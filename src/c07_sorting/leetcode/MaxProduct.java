/* 1464 .Maximum Product of Two Elements in an Array ( easy)
-------------------------------------------------------------
You are given an array of integers nums.
Choose two different indices i and j of that array.
Return the maximum value of (nums[i] - 1) * (nums[j] - 1).

Example 1:
Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 

Example 2:
Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.

Example 3:
Input: nums = [3,7]
Output: 12
 */



package c07_sorting.leetcode;

public class MaxProduct {
	public static void main(String[] args) {
		int nums[] = { 3, 4, 5, 2 };
		MaxProduct obj = new MaxProduct();
		int result = obj.maxProduct(nums);
		System.out.println(result);

	}

	public int maxProduct(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}

			}
		}
		int n = nums.length;
		int product = (nums[n - 1] - 1) * (nums[n - 2] - 1);

		return product;

	}

}
