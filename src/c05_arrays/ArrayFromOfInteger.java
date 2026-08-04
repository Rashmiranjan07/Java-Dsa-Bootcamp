package c05_arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayFromOfInteger {
	public static void main(String[] args) {
		int[] num = { 1, 2, 0, 0 };
		int k = 36;
		ArrayFromOfInteger obj = new ArrayFromOfInteger();
		List<Integer> ans = obj.addToArrayForm(num, k);
		System.out.println(ans);

	}

	public List<Integer> addToArrayForm(int[] num, int k) {
		int arr = 0;

		// Convert array to number
		for (int digit : num) {
			arr = arr * 10 + digit;
		}

		// Add k
		arr += k;

		// Convert number back to List<Integer>
		List<Integer> result = new ArrayList<>();

		String s = Integer.toString(arr);

		for (char ch : s.toCharArray()) {
			result.add(ch - '0');
		}

		return result;

	}

}
