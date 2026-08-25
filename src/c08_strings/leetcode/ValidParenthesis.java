/* 20. Valid Parentheses (Easy)
 ------------------------------
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false
 
 */

package c08_strings.leetcode;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		String s = "()[]{}";
		ValidParenthesis obj = new ValidParenthesis();
		boolean result = obj.isValid(s);
		System.out.println(result);

	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();

				if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
