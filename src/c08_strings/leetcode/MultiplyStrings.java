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

		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		int[] result = new int[num1.length() + num2.length()];

		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {

				int a = num1.charAt(i) - '0';
				int b = num2.charAt(j) - '0';

				int pos = i + j + 1;

				int total = a * b + result[pos];

				result[pos] = total % 10;
				result[pos - 1] += total / 10;
			}
		}

		StringBuilder ans = new StringBuilder();

		for (int x : result) {
			if (ans.length() == 0 && x == 0) {
				continue;
			}
			ans.append(x);
		}

		return ans.toString();
	}
}
