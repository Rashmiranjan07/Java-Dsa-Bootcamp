/* 233. Number of Digit One (Hard)
  -------------------------------
Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

Example 1:
Input: n = 13
Output: 6

Example 2:
Input: n = 0
Output: 0
 */

package c12_math.questions;

public class CountDigitOne {
	public static void main(String[] args) {
		int n = 13;
		CountDigitOne obj = new CountDigitOne();
		int result = obj.countDigitOne(n);
		System.out.println(result);
	}

	public int countDigitOne(int n) {
		if (n <= 0) {
			return 0;
		}

		int count = 0;

		for (long i = 1; i <= n; i *= 10) {
			long higher = n / (i * 10);
			long current = (n / i) % 10;
			long lower = n % i;

			if (current == 0) {
				count += higher * i;
			} else if (current == 1) {
				count += higher * i + lower + 1;
			} else {
				count += (higher + 1) * i;
			}
		}

		return count;

	}

}
