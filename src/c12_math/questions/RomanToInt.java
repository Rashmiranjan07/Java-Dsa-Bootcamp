/*

 */


package c12_math.questions;

public class RomanToInt {
	public static void main(String[] args) {
		String s = "III";
		RomanToInt obj = new RomanToInt();
		int result = obj.romanToInt(s);
		System.out.println(result);

	}

	public int romanToInt(String s) {
		int total = 0;

		for (int i = 0; i < s.length(); i++) {
			int current = getValue(s.charAt(i));

			if (i < s.length() - 1) {
				int next = getValue(s.charAt(i + 1));

				if (current < next) {
					total -= current;
				} else {
					total += current;
				}
			} else {
				total += current;
			}
		}

		return total;
	}

	private int getValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
