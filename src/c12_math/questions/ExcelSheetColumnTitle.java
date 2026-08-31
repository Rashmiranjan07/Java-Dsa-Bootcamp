/* 168. Excel Sheet Column Title (Easy)
---------------------------------------
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

package c12_math.questions;

public class ExcelSheetColumnTitle {
	public static void main(String[] args) {
		int columnNumber = 1;
		ExcelSheetColumnTitle obj = new ExcelSheetColumnTitle();
		String result = obj.convertToTitle(columnNumber);
		System.out.println(result);

	}

	public String convertToTitle(int columnNumber) {
		String result = "";
		while (columnNumber > 0) {
			columnNumber--;
			int remainder = columnNumber % 26;
			char ch = (char) ('A' + remainder);
			result = ch + result;
			columnNumber = columnNumber / 26;
		}

		return result;
	}

}
