/* 686. Repeated String Match ( medium)
 -------------------------------------
Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.
Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

Example 1:
Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.

Example 2:
Input: a = "a", b = "aa"
Output: 2
 
 */


package c08_strings.leetcode;

public class RepeatedStringMatch {
	public static void main(String[] args) {
		String a = "abcd";
		String b = "cdabcdab";
		RepeatedStringMatch obj = new RepeatedStringMatch();
		int result = obj.repeatedStringMatch(a, b);
		System.out.println(result);

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
			return count + 1;
		}

		return -1;

	}

}
