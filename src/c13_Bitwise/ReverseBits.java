/* 190. Reverse Bits (Easy)
----------------------------
Reverse bits of a given 32 bits signed integer.

Example 1:
Input: n = 43261596
Output: 964176192
Explanation:
Integer	Binary
43261596	00000010100101000001111010011100
964176192	00111001011110000010100101000000

Example 2:
Input: n = 2147483644
Output: 1073741822
Explanation:
Integer	Binary
2147483644	01111111111111111111111111111100
1073741822	00111111111111111111111111111110

 */

package c13_Bitwise;

public class ReverseBits {
	public static void main(String[] args) {
		int n = 43261596;
		ReverseBits obj = new ReverseBits();
		int result = obj.reverseBits(n);
		System.out.println(result);

	}

	public int reverseBits(int n) {
		// Convert to 32-bit binary
		String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

		// Reverse the 32 bits
		String reversed = new StringBuilder(binary).reverse().toString();

		// Convert binary back to decimal
		long result = Long.parseLong(reversed, 2);

		return (int) result;

	}

}
