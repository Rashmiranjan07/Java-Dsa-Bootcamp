/* 556. Next Greater Element III (Medium)
  --------------------------------------
Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.
Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

Example 1:
Input: n = 12
Output: 21

Example 2:
Input: n = 21
Output: -1
 
 */

package c08_strings.leetcode;

public class NextGreaterElementIII {
	public static void main(String[] args) {
		int n = 21;
		NextGreaterElementIII obj = new NextGreaterElementIII();
		int result = obj.nextGreaterElement(n);
		System.out.println(result);

	}

	public int nextGreaterElement(int n) {

		char[] digits = String.valueOf(n).toCharArray();

		// 1. Find the pivot
		// always search for last two digit , for these we can divide into two part
		int i = digits.length - 2;

		while (i >= 0 && digits[i] >= digits[i + 1]) {
			i--;
		}

		// No pivot means digits are in descending order
		if (i < 0) {
			return -1;
		}

		// 2. Find the smallest digit greater than digits[i]
		int j = digits.length - 1;
		while (digits[j] <= digits[i]) {
			j--;
		}

		// swap
		char temp = digits[i];
		digits[i] = digits[j];
		digits[j] = temp;

		// 4. Reverse everything after pivot
		int left = i + 1;
		int right = digits.length - 1;

		while (left < right) {
			temp = digits[left];
			digits[left] = digits[right];
			digits[right] = temp;

			left++;
			right--;
		}

		// 5. Convert back to integer
		long result = Long.parseLong(new String(digits));

		// 32-bit integer check
		if (result > Integer.MAX_VALUE) {
			return -1;
		}

		return (int) result;
	}

}
