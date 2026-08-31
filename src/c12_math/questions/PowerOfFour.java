/* 342. Power of Four (Easy)
 * -------------------------
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true
 */

package c12_math.questions;

public class PowerOfFour {
	public static void main(String[] args) {
		int n = 16;
		PowerOfFour obj = new PowerOfFour();
		boolean result = obj.isPowerOfFour(n);
		System.out.println(result);

	}

	public boolean isPowerOfFour(int n) {

		if (n <= 0) { // edge cases
			return false;
		}

		while (n % 4 == 0) { // 16%4==0
			n = n / 4; // 16/4 = 4
						// 4/4 =1
		}

		return n == 1; // 1==1

	}

}
