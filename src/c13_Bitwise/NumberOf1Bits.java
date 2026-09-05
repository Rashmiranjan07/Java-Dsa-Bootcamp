/* 191. Number of 1 Bits (Easy)
 * ----------------------------
Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

Example 1:
Input: n = 11
Output: 3
Explanation:
The input binary string 1011 has a total of three set bits.

Example 2:
Input: n = 128
Output: 1
Explanation:
The input binary string 10000000 has a total of one set bit.

Example 3:
Input: n = 2147483645
Output: 30
Explanation:
The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

 */

package c13_Bitwise;

public class NumberOf1Bits {
	public static void main(String[] args) {
		int n = 11;
		NumberOf1Bits obj = new NumberOf1Bits();
		int result = obj.hammingWeight(n);
		System.out.println(result);
	}

	public int hammingWeight(int n) {
		String binary = Integer.toBinaryString(n);

		char[] arr = binary.toCharArray();

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				count++;
			}
		}
		return count;

	}

}
