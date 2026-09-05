/* 461. Hamming Distance (Easy)
 -----------------------------
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them.

Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.

Example 2:
Input: x = 3, y = 1
Output: 1

 */

package c13_Bitwise;

public class HammingDistance {
	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		HammingDistance obj = new HammingDistance();
		int result = obj.hammingDistance(x, y);
		System.out.println(result);

	}

	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);

	}

}

/*
 * How it works ---------------- 1. x ^ y (XOR) gives 1 wherever the bits of x
 * and y are different. 2. Integer.bitCount(...) counts the number of 1s. 3.
 * That count is exactly the Hamming distance.
 */
