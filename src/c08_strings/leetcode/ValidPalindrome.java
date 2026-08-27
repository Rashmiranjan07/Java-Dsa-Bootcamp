/* 125. Valid Palindrome (Easy)
-------------------------------
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 */

package c08_strings.leetcode;

public class ValidPalindrome {
	public static void main(String[] args) {
		String str = "cac";
		ValidPalindrome obj = new ValidPalindrome();
		boolean result = obj.isPalindrome(str);
		System.out.println(result);
	}

	public boolean isPalindrome(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}

		str = str.toLowerCase();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			if (!Character.isLetterOrDigit(str.charAt(left))) {
				left++;
				continue;
			}

			if (!Character.isLetterOrDigit(str.charAt(right))) {
				right--;
				continue;
			}

			char start = str.charAt(left);
			char end = str.charAt(right);

			if (start != end) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

}
