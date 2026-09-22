package c08_strings.leetcode;

public class BuddyStrings {
	public static void main(String[] args) {
		String s = "aa";
		String goal = "aa";
	}

	public boolean buddyStrings(String s, String goal) {
		char[] arr = s.toCharArray();

		char temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		s = new String(arr);
		if (s == goal) {
			return true;
		}
		return false;
	}

}
