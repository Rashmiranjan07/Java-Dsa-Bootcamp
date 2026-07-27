// Highest frequency of an digit inside an array 

package c05_arrays;

import java.util.Arrays;

public class HighestFrequency {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 2, 4, 1 };

		int result = getHighestFrequencyDigit(arr);
		System.out.println("Concentration = " + result);

	}

	public static int getHighestFrequencyDigit(int[] arr) {
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
			}
		}

		return maxCount;

	}
}
