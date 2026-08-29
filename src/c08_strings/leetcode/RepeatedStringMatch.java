package c08_strings.leetcode;

public class RepeatedStringMatch {
	public static void main(String[] args) {
		String a = "abcd";
		String b = "cdabcdab";
	}

	public int repeatedStringMatch(String a, String b) {
		String temp = a;
		int count = 1;

		while (temp.length() < b.length()) {
			temp = temp + a;
			count++;
		}
		if (temp.contains(b)) {
			return count;
		} else if ((temp + a).contains(b)) {
			return count;
		}

		return -1;

	}

}
