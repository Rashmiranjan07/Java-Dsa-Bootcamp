/* 204. Count Primes (Medium)
 * ---------------------------
Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0

Example 3:
Input: n = 1
Output: 0
 */

package c12_math.questions;

public class CountPrime {
	public static void main(String[] args) {
		int n = 10;
		CountPrime obj = new CountPrime();
		int result = obj.countPrimes(n);
		System.out.println(result);

	}

	public int countPrimes(int n) {
		if (n < 1) {
			return 0;
		}
		while (n > 0) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			int maxCount = 0;
			while (count <= 2) {
				return maxCount++;
			}
		}
		return -1;
	}

}
