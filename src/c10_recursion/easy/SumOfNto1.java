// Sum of Numbers n-1 

package c10_recursion.easy;

public class SumOfNto1 {
	public static void main(String[] args) {
		int ans = fact(5);
		System.out.println(ans);
	}

	static int fact(int n) {
		if (n <= 1) {
			return 1;
		}

		return n + fact(n - 1);
	}

}
