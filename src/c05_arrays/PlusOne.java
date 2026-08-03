/* Plus One
 -----------
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
 */

package c05_arrays;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		PlusOne obj = new PlusOne();
		int[] result = obj.plusOne(digits);
		System.out.println(Arrays.toString(result));
	}

	public int[] plusOne(int[] digits) {
		int num = 0;

		// Convert array to number
		for (int digit : digits) {
			num = num * 10 + digit;
		}

		// Add one
		num++;

		// Convert number back to array
		String s = Integer.toString(num);
		int[] ans = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			ans[i] = s.charAt(i) - '0';
		}

		return ans;
	}
}
