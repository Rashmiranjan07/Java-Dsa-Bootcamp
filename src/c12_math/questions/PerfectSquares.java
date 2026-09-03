/* 279. Perfect Squares (Medium)
--------------------------------
Given an integer n, return the least number of perfect square numbers that sum to n.
A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

Example 1:
Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.

Example 2:
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.

 */

package c12_math.questions;

public class PerfectSquares {
	public static void main(String[] args) {
		int n = 12;
		PerfectSquares obj = new PerfectSquares();
		int result = obj.numSquares(n);
		System.out.println(result);
	}

	public int numSquares(int n) {
		int[] dp = new int[n + 1];

		// dp[0] = 0
		// 0 needs 0 perfect squares

		for (int i = 1; i <= n; i++) {

			dp[i] = i; // maximum: 1 + 1 + 1 + ...

			for (int j = 1; j * j <= i; j++) {

				int square = j * j;

				dp[i] = Math.min(dp[i], 1 + dp[i - square]);
			}
		}

		return dp[n];
	}

}
