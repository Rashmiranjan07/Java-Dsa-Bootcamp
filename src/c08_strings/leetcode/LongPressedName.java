/* 925. Long Pressed Name (Easy)
---------------------------------
Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

Example 1:
Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.

Example 2:
Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.

 */

package c08_strings.leetcode;

public class LongPressedName {

	public static void main(String[] args) {
		String name = "alex";
		String typed = "aaleex";

		LongPressedName obj = new LongPressedName();

		System.out.println(obj.isLongPressedName(name, typed));
	}

	public boolean isLongPressedName(String name, String typed) {

		int i = 0;
		int j = 0;

		while (j < typed.length()) {

			// Current characters match
			if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
				i++;
				j++;
			}

			// Long pressed character
			else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
				j++;
			}

			// Invalid character
			else {
				return false;
			}
		}

		// All characters from name must be matched
		return i == name.length();
	}
}