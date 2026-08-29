/* 1324. Print Words Vertically (Medium)
  -------------------------------------
Given a string s. Return all the words vertically in the same order in which they appear in s.
Words are returned as a list of strings, complete with spaces when is necessary. (Trailing spaces are not allowed).
Each word would be put on only one column and that in one column there will be only one word.

Example 1:
Input: s = "HOW ARE YOU"
Output: ["HAY","ORO","WEU"]
Explanation: Each word is printed vertically. 
 "HAY"
 "ORO"
 "WEU"

Example 2:
Input: s = "TO BE OR NOT TO BE"
Output: ["TBONTB","OEROOE","   T"]
Explanation: Trailing spaces is not allowed. 
"TBONTB"
"OEROOE"
"   T"

Example 3:
Input: s = "CONTEST IS COMING"
Output: ["CIC","OSO","N M","T I","E N","S G","T"]
 */

package c08_strings.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {

	public static void main(String[] args) {
		String s = "HOW ARE YOU";
		PrintWordsVertically obj = new PrintWordsVertically();
		List<String> result = obj.printVertically(s);
		System.out.println(result);
	}

	public List<String> printVertically(String s) {

		String[] words = s.split(" ");

		List<String> resultList = new ArrayList<>();

		// Find the longest word
		int maxLength = 0;

		for (String word : words) {
			maxLength = Math.max(maxLength, word.length());
		}

		// Go character by character
		for (int i = 0; i < maxLength; i++) {

			String result = "";

			// Go word by word
			for (String word : words) {

				if (i < word.length()) {
					result = result + word.charAt(i);
				} else {
					result = result + " ";
				}
			}

			// Remove trailing spaces
			resultList.add(result.stripTrailing());
		}

		return resultList;
	}
}
