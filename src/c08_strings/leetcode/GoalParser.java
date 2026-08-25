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
