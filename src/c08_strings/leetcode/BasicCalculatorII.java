/* 227. Basic Calculator II (Medium)
 * ---------------------------------
Given a string s which represents an expression, evaluate this expression and return its value. 
The integer division should truncate toward zero.
You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

Example 1:
Input: s = "3+2*2"
Output: 7

Example 2:
Input: s = " 3/2 "
Output: 1

Example 3:
Input: s = " 3+5 / 2 "
Output: 5
 */

package c08_strings.leetcode;

public class BasicCalculatorII {
	public static void main(String[] args) {
		String s = "3+2*2";
		BasicCalculatorII obj = new BasicCalculatorII();
		int result = obj.calculate(s);
		System.out.println(result);

	}

	public int calculate(String s) {
		int result = 0;
		int number = 0;
		int last = 0;
		char op = '+';

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				number = number * 10 + (c - '0');
			}

			if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {

				if (op == '+') {
					result += last;
					last = number;
				} else if (op == '-') {
					result += last;
					last = -number;
				} else if (op == '*') {
					last = last * number;
				} else if (op == '/') {
					last = last / number;
				}

				op = c;
				number = 0;
			}
		}

		return result + last;

	}
}
