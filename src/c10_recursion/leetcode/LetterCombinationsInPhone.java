/* 17. Letter Combinations of a Phone Number (Medium)
-----------------------------------------------------
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = "2"
Output: ["a","b","c"]
 */

package c10_recursion.leetcode;

import java.util.List;

public class LetterCombinationsInPhone {
	public static void main(String[] args) {
		System.out.println(padRet("", "12").size());
		System.out.println(padCount("", "12"));
	}

	static void pad(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digit = up.charAt(0) - '0'; // this will convert '2' into 2
		for (int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			pad(p + ch, up.substring(1));
		}

	}

	static ArrayList<String> padRet(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit = up.charAt(0) - '0'; // this will convert '2' into 2

		ArrayList<String> list = new ArrayList<>();

		for (int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			list.addAll(padRet(p + ch, up.substring(1)));
		}
		return list;
	}

	static int padCount(String p, String up) {
		if (up.isEmpty()) {
			return 1;
		}
		int count = 0;
		int digit = up.charAt(0) - '0'; // this will convert '2' into 2
		for (int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			count = count + padCount(p + ch, up.substring(1));
		}
		return count;
	}
}