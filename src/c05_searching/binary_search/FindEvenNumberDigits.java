/*Find numbers with even number of digits
 * ----------------------------------------
Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
 */

package c05_searching.binary_search;

public class FindEvenNumberDigits {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(nums));
	}

	static int findNumbers(int[] nums) {
		int n = nums.length;
		int maxCount = 0;
		for (int i = 0; i < n; i++) {
			int num = nums[i];
			int count = 0;
			while (num > 0) {
				count++;
				num = num / 10;
			}
			if (count % 2 == 0)
				maxCount++;
		}
		return maxCount;
	}
}


// short cut to find the digits 
// (int)(Math.log10(num)) +1;
