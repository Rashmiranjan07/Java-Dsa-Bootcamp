/* 1704. Determine if String Halves Are Alike (Easy)
----------------------------------------------------
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false.

Example 1:
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

Example 2:
Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.

 */

package c08_strings.leetcode;

public class HalvesAreAlike {
	public static void main(String[] args) {
		String s = "book";
		HalvesAreAlike obj = new HalvesAreAlike();
		boolean result = obj.halvesAreAlike(s);
		System.out.println(result);

	}

	public boolean halvesAreAlike(String s) {
		int mid = s.length() / 2;

		String first = s.substring(0, mid);
		String second = s.substring(mid);

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < first.length(); i++) {
			char ch = first.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				count1++;
			}
		}

		for (int i = 0; i < second.length(); i++) {
			char ch = second.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				count2++;
			}
		}

		return count1 == count2;

	}

}
