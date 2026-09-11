/* 171. Excel Sheet Column Number (Easy)
 ----------------------------------------
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
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
Input: columnTitle = "A"
Output: 1

Example 2:
Input: columnTitle = "AB"
Output: 28

Example 3:
Input: columnTitle = "ZY"
Output: 701

 */


package c08_strings.leetcode;

public class ExcelShetColumnNum {
	public static void main(String[] args) {
		String columnTitle = "A";
		ExcelShetColumnNum obj = new ExcelShetColumnNum();
		int result = obj.titleToNumber(columnTitle);
		System.out.println(result);

	}

	public int titleToNumber(String columnTitle) {
		int result = 0;

		for (char ch : columnTitle.toCharArray()) {
			int value = ch - 'A' + 1;
			result = result * 26 + value;
		}

		return result;

	}

}
