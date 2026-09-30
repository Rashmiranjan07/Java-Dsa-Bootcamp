package c12_math.questions;

public class PrimeArrangements {
	public static void main(String[] args) {
		int n = 5;
		

	}

	public int numPrimeArrangements(int n) {
		int PrimneCount = 0;
		int nonPrimeCount = 0;
		for (int i = 1; i <= n; i++) {

			if (isPrime(i)) {
				PrimneCount++;
			} else {
				nonPrimeCount++;
			}
		}

		int ans = fact(primeCount) * fact(nonPrimeCount);

		return ans;

	}

	static int fact(int n) {
		int pro = 1;
		for (int i = 1; i < n; i++) {
			pro = pro * i;
		}
		return pro;
	}

	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}