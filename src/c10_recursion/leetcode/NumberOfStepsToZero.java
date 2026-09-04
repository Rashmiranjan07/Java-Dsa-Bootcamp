package c10_recursion.leetcode;

public class NumberOfStepsToZero {
	public static void main(String[] args) {
		int num = 14;
		NumberOfStepsToZero obj = new NumberOfStepsToZero();
		int result = obj.numberOfSteps(num);
		System.out.println(result);
	}

	public int numberOfSteps(int num) {
		return helper(num, 0);
	}

	private int helper(int num, int steps) {
		if (num == 0) {
			return steps;
		}

		if (num % 2 == 0) {
			return helper(num / 2, steps + 1);
		}
		return helper(num - 1, steps + 1);
	}

}
