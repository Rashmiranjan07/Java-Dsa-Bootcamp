/*
1175. Prime Arrangements
Solved
Easy
Topics
premium lock icon
Companies
Hint
Return the number of permutations of 1 to n so that prime numbers are at prime indices (1-indexed.)

(Recall that an integer is prime if and only if it is greater than 1, and cannot be written as a product of two positive integers both smaller than it.)

Since the answer may be large, return the answer modulo 10^9 + 7.

 

Example 1:

Input: n = 5
Output: 12
Explanation: For example [1,2,5,4,3] is a valid permutation, but [5,2,3,4,1] is not because the prime number 5 is at index 1.
Example 2:

Input: n = 100
Output: 682289015
 */


package c12_math.questions;

public class PrimeArrangements {
	public static void main(String[] args) {
		int n = 5;
		PrimeArrangements obj = new PrimeArrangements();
		int result = obj.numPrimeArrangements(n);
		System.out.println(result);

	}

	static final long MOD = 1_000_000_007;
	public int numPrimeArrangements(int n) {

		int primeCount = 0;
		int nonPrimeCount = 0;

		for (int i = 1; i <= n; i++) {

			if (isPrime(i)) {
				primeCount++;
			} else {
				nonPrimeCount++;
			}
		}

		long ans = fact(primeCount) * fact(nonPrimeCount);

		ans = ans % MOD;

		return (int) ans;
	}

	static long fact(int n) {

		long pro = 1;

		for (int i = 1; i <= n; i++) {
			pro = (pro * i) % MOD;
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
