package c12_math.questions;

public class ArmstrongNum {
	public static void main(String[] args) {
		int n = 135;
		System.out.println(armstrongNumber(n));
	}

	static boolean armstrongNumber(int n) {
		int sum = 0;
		int temp = n;

		while (temp > 0) {
			int digit = temp % 10;
			sum = sum + digit * digit * digit;
			temp = temp / 10;
		}

		return sum == n;

	}

}
