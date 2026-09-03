package c12_math.questions;

public class PerfectSquares {
	public static void main(String[] args) {
		int n = 12;
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
