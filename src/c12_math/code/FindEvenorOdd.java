package c12_math.code;

public class FindEvenorOdd {
	public static void main(String[] args) {
		int n = 67;
		System.out.println(isOdd(n));
	}

	static boolean isOdd(int n) {
		return (n & 1) == 1; // bcoz if all the numbers & 1 that gives the same number
	}
}

