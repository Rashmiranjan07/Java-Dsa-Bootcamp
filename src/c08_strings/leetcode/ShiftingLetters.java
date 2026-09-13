package c08_strings.leetcode;

public class ShiftingLetters {
	public static void main(String[] args) {
		String s = "abc";
		int[] shifts = { 1, 1, 1};
		ShiftingLetters obj = new ShiftingLetters();
		String result = obj.shiftingLetters(s, shifts);
		System.out.println(result);

	}

	public String shiftingLetters(String s, int[] shifts) {
		char[] arr = s.toCharArray();
		long shift = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			shift = (shift + shifts[i]) % 26;
			arr[i] = (char) ('a' + (arr[i] - 'a' + shift) % 26);
		}
		return new String(arr);
	}

}
