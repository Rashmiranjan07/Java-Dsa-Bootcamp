package c12_math.questions;

public class ConvertToMinusTwo {
	public static void main(String[] args) {
		int n = 3;
	}

	public String baseNeg2(int n) {
		if (n == 0) {
			return "0";
		}

		StringBuilder result = new StringBuilder();

		while (n != 0) {
			int remainder = n % -2;
			n = n / -2;

			if (remainder < 0) {
				remainder += 2;
				n += 1;
			}

			result.append(remainder);
		}

		return result.reverse().toString();

	}

}
