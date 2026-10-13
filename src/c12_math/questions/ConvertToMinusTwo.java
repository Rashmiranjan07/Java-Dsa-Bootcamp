/* 1017. Convert to Base -2 (Medium)

Given an integer n, return a binary string representing its representation in base -2.

Note that the returned string should not have leading zeros unless the string is "0".

 

Example 1:

Input: n = 2
Output: "110"
Explantion: (-2)2 + (-2)1 = 2
Example 2:

Input: n = 3
Output: "111"
Explantion: (-2)2 + (-2)1 + (-2)0 = 3
Example 3:

Input: n = 4
Output: "100"
Explantion: (-2)2 = 4

 */



package c12_math.questions;

public class ConvertToMinusTwo {
	public static void main(String[] args) {
		int n = 3;
		ConvertToMinusTwo obj = new ConvertToMinusTwo();
		String result = obj.baseNeg2(n);
		System.out.println(result);
	}

	public String baseNeg2(int n) {
		if (n == 0) {
			return "0";
		}

		StringBuilder result = new StringBuilder();

		while (n != 0) {
			int remainder = n % -2;
			n = n / -2;

			if (remainder < 0) {
				remainder += 2;
				n += 1;
			}

			result.append(remainder);
		}

		return result.reverse().toString();

	}

}
