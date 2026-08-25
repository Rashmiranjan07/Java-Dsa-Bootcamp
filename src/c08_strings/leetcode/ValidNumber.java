/*

 */


package c08_strings.leetcode;

public class ValidNumber {
	public static void main(String[] args) {
		String s = "0";
		ValidNumber obj = new ValidNumber();
		boolean result = obj.isNumber(s
				);
		System.out.println(result);

	}

	public boolean isNumber(String s) {
		s = s.trim();

		boolean digitSeen = false;
		boolean dotSeen = false;
		boolean eSeen = false;
		boolean digitAfterE = true;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isDigit(c)) {
				digitSeen = true;

				if (eSeen) {
					digitAfterE = true;
				}

			} else if (c == '+' || c == '-') {
				// Sign is valid only at the beginning or immediately after e/E
				if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
					return false;
				}

			} else if (c == '.') {
				// Only one decimal point, and not after e/E
				if (dotSeen || eSeen) {
					return false;
				}
				dotSeen = true;

			} else if (c == 'e' || c == 'E') {
				// Only one e/E and it must come after a number
				if (eSeen || !digitSeen) {
					return false;
				}

				eSeen = true;
				digitAfterE = false;

			} else {
				return false;
			}
		}

		return digitSeen && digitAfterE;
	}
}
