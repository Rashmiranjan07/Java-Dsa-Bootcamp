/*1759. Count Number of Homogenous Substrings (Medium)
 ---------------------------------------------------
Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.
A string is homogenous if all the characters of the string are the same.
A substring is a contiguous sequence of characters within a string.

Example 1:
Input: s = "abbcccaa"
Output: 13
Explanation: The homogenous substrings are listed as below:
"a"   appears 3 times.
"aa"  appears 1 time.
"b"   appears 2 times.
"bb"  appears 1 time.
"c"   appears 3 times.
"cc"  appears 2 times.
"ccc" appears 1 time.
3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.

Example 2:
Input: s = "xy"
Output: 2
Explanation: The homogenous substrings are "x" and "y".

Example 3:
Input: s = "zzzzz"
Output: 15
 */

package c08_strings.leetcode;

public class CountHomogeneousSubStr {
	public static void main(String[] args) {
		String s = "abbcccaa";
		CountHomogeneousSubStr obj = new CountHomogeneousSubStr();
		int result = obj.countHomogenous(s);
		System.out.println(result);

	}

	public int countHomogenous(String s) {
		long count = 0;
		long same = 0;

		for (int i = 0; i < s.length(); i++) { // go for each digit

			if (i > 0 && s.charAt(i) == s.charAt(i - 1)) { // check homogeneous
				same++;
			} else {
				same = 1;
			}
			count += same; // count how many same/Homogeneous available
		}

		return (int) (count % 1000000007);

	}

}
