package c12_math.questions;

public class UglyNumber {
	public static void main(String[] args) {

	}

	public boolean isUgly(int n) {
		if (n <= 0) {
			return false;
		}

		while (n % 2 == 0) {
			n /= 2;
		}

	}

}
