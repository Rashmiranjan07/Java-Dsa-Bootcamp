/* 50. Pow(x, n) (Medium)
 -----------------------
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */



package c12_math.questions;

public class MyPow {
	public static void main(String[] args) {
		double x = 2.0000;
		int n = 10;
		MyPow obj = new MyPow();
		double result = obj.myPow(x, n);
		System.out.println(result);
	}

	public double myPow(double x, int n) {
		long power = n; // long to handle Integer.MIN_VALUE

		if (power < 0) {
			x = 1 / x;
			power = -power;
		}
		double result = 1.0;

		while (power > 0) {
			if (power % 2 == 1) {
				result *= x;
			}
			x *= x;
			power /= 2;
		}

		return result;

	}

}
