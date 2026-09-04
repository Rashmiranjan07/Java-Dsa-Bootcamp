//Product of Digits 

package c10_recursion.easy;

public class DigitProduct {
	public static void main(String[] args) {
		int ans = product(1234);
		System.out.println(ans);
	}

	static int product(int n) {
		if (n%10 == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return (n % 10) * product(n / 10);
	}

}
