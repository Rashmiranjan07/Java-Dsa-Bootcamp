/* 179. Largest Number (Medium)
 -------------------------------
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
Since the result may be very large, so you need to return a string instead of an integer.

Example 1:
Input: nums = [10,2]
Output: "210"

Example 2:
Input: nums = [3,30,34,5,9]
Output: "9534330"
 
 */

package c07_sorting.leetcode;

import java.util.Arrays;

public class LargestNumber {
	public static void main(String[] args) {
		int nums[] = { 10, 2 };
		LargestNumber obj = new LargestNumber();
		String result = obj.largestNumber(nums);
		System.out.println(result);
	}

	public String largestNumber(int[] nums) {
		String[] arr = new String[nums.length];

		// convert int[] to string[]
		for (int i = 0; i < nums.length; i++) {
			arr[i] = String.valueOf(nums[i]);
		}

		// Custom sorting
		Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

		// If the largest number is 0
		if (arr[0].equals("0")) {
			return "0";
		}
		// Build answer
		StringBuilder ans = new StringBuilder();

		for (String s : arr) {
			ans.append(s);
		}

		return ans.toString();
	}

}
