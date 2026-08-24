package c08_strings.leetcode;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "aba";
		PalindromeString obj = new PalindromeString();
		boolean result = obj.isPalindrome(str);
		System.out.println(result);

	}

	static boolean isPalindrome(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		str = str.toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);

			if (start != end) {
				return false;
			}
		}
		return true;
	}

}
