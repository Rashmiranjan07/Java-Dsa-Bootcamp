/* Add digit 
 * ----------
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
 */


package c02_basics;

public class AddDigits {
	public static void main(String[] args) {
		int num = 38;
		AddDigits obj = new AddDigits();
		int result = obj.addDigits(num);
		System.out.println(result);
	}

	public int addDigits(int num) {
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10; // get the last digit
				num /= 10; // remove the last digit

			}
			num = sum;
		}
		return num;

	}
}
