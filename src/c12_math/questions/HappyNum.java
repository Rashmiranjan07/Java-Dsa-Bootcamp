package c12_math.questions;

public class HappyNum {
	public static void main(String[] args) {
		int n = 19;
		HappyNum obj = new HappyNum();
		boolean result = obj.isHappy(n);
		System.out.println(result);

	}

	public boolean isHappy(int n) {
		while (n != 1 && n != 4) {
			int sum = 0;

			while (n > 0) {
				int digit = n % 10;
				sum = sum + digit * digit;
				n = n / 10;
			}
			n = sum;
		}
		return n == 1;
	}

}
