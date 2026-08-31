/* 728. Self Dividing Numbers (Easy)
 *----------------------------------
A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.
Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right] (both inclusive).

Example 1:
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

Example 2:
Input: left = 47, right = 85
Output: [48,55,66,77]
 
 */

package c12_math.questions;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		SelfDividingNumbers obj = new SelfDividingNumbers();
		List<Integer> result = obj.selfDividingNumbers(left, right);
		System.out.println(result);

	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = left; i <= right; i++) {

			int original = i;
			int num = i;
			boolean isSelfDividing = true;

			while (num > 0) {

				int digit = num % 10;

				if (digit == 0 || original % digit != 0) {
					isSelfDividing = false;
					break;
				}

				num = num / 10;
			}

			if (isSelfDividing) {
				list.add(original);
			}
		}

		return list;
	}
}