package c12_math.questions;

public class MaxProduct {
	public static void main(String[] args) {
		int n = 124;
		MaxProduct obj = new MaxProduct();
		int result = obj.maxProduct(n);
		System.out.println(result);
	}

	public int maxProduct(int n) {
		String str = String.valueOf(n);
		int[] arr = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}

		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int product = arr[i] * arr[i + 1];

			if (product > max) {
				max = product;
			}
		}

		return max;
	}

}
