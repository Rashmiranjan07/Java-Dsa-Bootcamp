package c07_sorting.leetcode;

public class HeightChecker {
	public static void main(String[] args) {
		int[] heights = { 1,1,4,2,1,3 };
		System.out.println(heightChecker(heights));

	}

	static public int heightChecker(int[] heights) {
		// Create a new array
		int[] expected = new int[heights.length];

		// Copy heights into expected
		for (int i = 0; i < heights.length; i++) {
			expected[i] = heights[i];
		}

		// Bubble sort expected array
		for (int i = 0; i < expected.length - 1; i++) {
			for (int j = 0; j < expected.length - 1 - i; j++) {

				if (expected[j] > expected[j + 1]) {
					int temp = expected[j];
					expected[j] = expected[j + 1];
					expected[j + 1] = temp;
				}
			}
		}

		// Compare original heights with sorted expected
		int count = 0;

		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != expected[i]) {
				count++;
			}
		}

		return count;
	}
}
