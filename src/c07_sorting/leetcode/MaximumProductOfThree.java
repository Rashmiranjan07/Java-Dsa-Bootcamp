/* 628. Maximum Product of Three Numbers (Easy)
-----------------------------------------------
You are given an integer array nums.
Find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6
Explanation:
The only three numbers are 1, 2, and 3, so the maximum product is 1 * 2 * 3 = 6.

Example 2:
Input: nums = [1,2,3,4]
Output: 24
Explanation:
The largest product comes from the three greatest numbers: 2 * 3 * 4 = 24.

Example 3:
Input: nums = [-1,-2,-3]
Output: -6
Explanation:
The only three numbers are -1, -2, and -3, so the maximum product is (-1) * (-2) * (-3) = -6.

 */

package c07_sorting.leetcode;

public class MaximumProductOfThree {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		MaximumProductOfThree obj = new MaximumProductOfThree();
		int result = obj.maximumProduct(nums);
		System.out.println(result);
	}

	public int maximumProduct(int[] arr) {
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
		int n = arr.length;

		int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
		int product2 = arr[0] * arr[1] * arr[n - 1];
		return Math.max(product1, product2);
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
