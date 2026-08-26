/* 168. Excel Sheet Column Title (Easy)
----------------------------------------
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 
Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"
 */

package c08_strings.leetcode;

public class ExcelSheetColTit {
	public static void main(String[] args) {
		int columnNumber = 701;
		ExcelSheetColTit obj = new ExcelSheetColTit();
		String ans = obj.convertToTitle(columnNumber);
		System.out.println(ans);
	}

	public String convertToTitle(int columnNumber) {
		String result = "";
		while (columnNumber > 0) { // true then emters the loop
			columnNumber--; // for % 26 normally gives values from 0 to 25. So we first shift the number
							// down by 1.
			int remainder = columnNumber % 26; // calculate with 26 to receive the alphabet
			char ch = (char) ('A' + remainder); // typecast
			result = ch + result; // put it in the result
			columnNumber = columnNumber / 26; // if greater than 26 loop will countinued after z -> AA
												// if remove the last number and counted once again
		}

		return result;
	}

}
