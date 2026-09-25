package c08_strings.leetcode;

public class ConsecutiveCharacters {
	public static void main(String[] args) {
		String s = "abbcccddddeeeeedcba";

	}

	public int maxPower(String s) {
		int maxCount = 1;
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				count = 1;
			}

			maxCount = Math.max(maxCount, count);

		}
		return maxCount;

	}

}
