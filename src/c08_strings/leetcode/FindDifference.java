package c08_strings.leetcode;

public class FindDifference {
	public static void main(String[] args) {

	}

	public char findTheDifference(String s, String t) {
		char result = 0;

		for (char c : s.toCharArray()) {
			result ^= c;
		}

		for (char c : t.toCharArray()) {
			result ^= c;
		}

		return result;
	}

}
