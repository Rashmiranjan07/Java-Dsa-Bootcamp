// Check Palindrome 

package c10_recursion.easy;

public class Palindrome {
	static int sum = 0;

	static void rev1(int n) {
		if (n == 0) {
			return;
		}
		int rem = n % 10;
		sum = sum * 10 + rem;
		rev1(n / 10);
	}

	static int rev2(int n) {
		// sometimes you might need some additional variables in the argument
		// in that case , mkae another function
		int digits = (int) (Math.log10(n)) + 1;
		return helper(n, digits);
	}

	private static int helper(int n, int digits) {
		if (n % 10 == n) {
			return n;
		}
		int rem = n % 10;
		return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
	}

	static boolean isPalindrome(int n) {
		return n == rev2(n);

	}

	public static void main(String[] args) {
//		rev1(1234);
//		System.out.println(sum);

//		System.out.println(rev2(1234));
		System.out.println(isPalindrome(1234321));
	}
}
