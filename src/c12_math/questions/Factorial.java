package c12_math.questions;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));

	}
	static int factorial(int n) {

		int product = 1;
		for (int i = 1; i <= n; i++) {
			product *= i;
		}
		return product;
	}

}
