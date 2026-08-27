/* 224. Basic Calculator (Hard)
 * ----------------------------
Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

Example 1:
Input: s = "1 + 1"
Output: 2

Example 2:
Input: s = " 2-1 + 2 "
Output: 3

Example 3:
Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23

 */

package c08_strings.leetcode;

import java.util.Stack;

public class BasicCalculator {
	public static void main(String[] args) {
		String s = " 2-1 + 2 ";
		BasicCalculator obj = new BasicCalculator();
		int result = obj.calculate(s);
		System.out.println(result);
	}

	public int calculate(String s) {

		Stack<Integer> stack = new Stack<>();

		int result = 0; // answer we have calculate so far
		int number = 0; // current number we are adding
		int sign = 1; // +/-

		for (char c : s.toCharArray()) {

			if (Character.isDigit(c)) {
				number = number * 10 + (c - '0'); // formula to know the number
			}

			else if (c == '+') {
				result = result + sign * number; // if + sign then did this
				number = 0;
				sign = 1;
			}

			else if (c == '-') {
				result = result + sign * number; // if - sign then did this
				number = 0;
				sign = -1;
			}

			else if (c == '(') {

				// Remember what was before (
				stack.push(result);
				stack.push(sign);

				result = 0;
				sign = 1;
			}

			else if (c == ')') {

				// Finish calculation inside ()
				result = result + sign * number;
				number = 0;

				// Get back what was before (
				int oldSign = stack.pop();
				int oldResult = stack.pop();

				result = oldResult + oldSign * result;
			}
		}

		return result + sign * number;
	}
}
