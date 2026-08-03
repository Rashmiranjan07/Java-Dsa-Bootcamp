package c05_arrays;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		PlusOne obj = new PlusOne();
		int[] result = obj.plusOne(digits);
		System.out.println(Arrays.toString(result));

	}

	public int[] plusOne(int[] digits) {
		int num = 0;

		// Convert array to number
		for (int digit : digits) {
			num = num * 10 + digit;
		}

		// Add one
		num++;

		// Convert number back to array
		String s = Integer.toString(num);
		int[] ans = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			ans[i] = s.charAt(i) - '0';
		}

		return ans;
	}
}
