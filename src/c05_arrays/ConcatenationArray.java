//Concatenation of an array 

package c05_arrays;

import java.util.Arrays;

public class ConcatenationArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };

		ConcatenationArray obj = new ConcatenationArray();
		int[] result = obj.getConcatenation(arr);
		System.out.println(Arrays.toString(result));

	}

	public int[] getConcatenation(int[] arr) {
		int n = arr.length;

		int[] ans = new int[2 * n];

		for (int i = 0; i < n; i++) {
			ans[i] = arr[i];
			ans[i + n] = arr[i];

		}
		return ans;

	}

}
