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
//		  int primeCount = 0;
//
//	        for (int num = 2; num < n; num++) {
//	            int count = 0;
//
//	            for (int i = 1; i <= num; i++) {
//	                if (num % i == 0) {
//	                    count++;
//	                }
//	            }
//
//	            if (count == 2) {
//	                primeCount++;
//	            }
//	        }
//
//	        return primeCount;

		// time limit exceed

		boolean[] isPrime = new boolean[n];

		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i * i < n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j < n; j += i) {
					isPrime[j] = false;
				}
			}
		}

		int count = 0;

		for (int i = 2; i < n; i++) {
			if (isPrime[i]) {
				count++;
			}
		}

		return count;
	}

}
