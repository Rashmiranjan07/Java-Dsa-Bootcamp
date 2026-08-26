/*1309. Decrypt String from Alphabet to Integer Mapping (Easy)

You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
 */

package c08_strings.leetcode;

public class DecryptString {
	public static void main(String[] args) {
		String s = s = "10#11#12"; // jkab
		DecryptString obj = new DecryptString();
		String ans = obj.freqAlphabets(s);
		System.out.println(ans);
	}

	public String freqAlphabets(String s) {

		StringBuilder result = new StringBuilder();
		int i = 0;

		while (i < s.length()) {
			if(i+2<s.length() && s.charAt(i+2)=='#') { // if '#' present 
				int num=Integer.parseInt(s.substring(i, i+2)); // then divide into two substring
				result.append((char)('a'+num-1)); // and conveted into alphabets and put it in result
				i+=3;
			} else {
				int num = s.charAt(i) - '0';
				result.append((char) ('a' + num - 1));
				i++;
			}

		}
		return result.toString();

	}

}

