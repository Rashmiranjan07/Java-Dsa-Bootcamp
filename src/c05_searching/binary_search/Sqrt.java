/* 69.Sqrt(x)
 * ----------
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

 */

package c05_searching.binary_search;

public class Sqrt {
	public static void main(String[] args) {
		int x = 9;
		Sqrt obj = new Sqrt();
		int result = obj.mySqrt(x);
		System.out.println(result);

	}

	public int mySqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		int start = 1;
		int end = x;
		int ans = 0;
		while (start < end) {
			int mid = start + (end - start) / 2;
			// Use long to avoid integer overflow
			long square = (long) mid * mid;

			if (square == x) {
				return mid;
			} else if (square < x) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;

	}

}
