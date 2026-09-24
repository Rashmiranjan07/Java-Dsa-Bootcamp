package c12_math.questions;

public class MaxProduct {
	public static void main(String[] args) {
		int n = 22;

	}

	public int maxProduct(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;

	}

}
