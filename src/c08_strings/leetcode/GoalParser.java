/*1678. Goal Parser Interpretation (Easy)
-----------------------------------------
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.

Example 1:
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

Example 2:
Input: command = "G()()()()(al)"
Output: "Gooooal"

Example 3:
Input: command = "(al)G(al)()()G"
Output: "alGalooG"

 */


package c08_strings.leetcode;

public class GoalParser {
	public static void main(String[] args) {
		String command = "(al)G(al)()()G";
		GoalParser obj = new GoalParser();
		String answer = obj.interpret(command);
		System.out.println(answer);
	}

	public String interpret(String command) {

		return command.replace("()", "o") //1. Replace () with o:
				.replace("(", "") // 2. remove (
				.replace(")", ""); // 3. remove )

	}

}
