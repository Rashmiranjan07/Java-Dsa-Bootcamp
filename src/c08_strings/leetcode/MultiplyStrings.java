package c08_strings.leetcode;

public class MultiplyStrings {
	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "456";
		MultiplyStrings obj = new MultiplyStrings();
		String result = obj.multiply(num1, num2);
		System.out.println(result);

	}

	public String multiply(String num1, String num2) {

		int n1 = Integer.parseInt(num1); // 2
		int n2 = Integer.parseInt(num2); // 3

		int mult = 1;
		mult = n1 * n2;

		String s = String.valueOf(mult);

		return s;

	}

}
