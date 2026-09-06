/*
693. Binary Number with Alternating Bits
Easy
Topics
premium lock icon
Companies
Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

 

Example 1:

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
Example 2:

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.
Example 3:

Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
 */

package c13_Bitwise;

public class HasAlternatingBits {
	public static void main(String[] args) {
		int n = 5;
		HasAlternatingBits obj = new HasAlternatingBits();
		boolean result = obj.hasAlternatingBits(n);
		System.out.println(result);
	}

	public boolean hasAlternatingBits(int n) {
		int x = n ^ (n >> 1);

		return (x & (x + 1)) == 0;
	}

}

/*
 * For n = 5:
 *  n = 101
 *  n >> 1 = 010 
 *  n ^ = 111 
 *  Now: 
 *  x = 111 
 *  x + 1 = 1000 
 *  Then:
 * 
 * 0111 
 * & 
 * 1000 
 * ------ 
 * 0000
 * 
 * Therefore: (x & (x + 1)) == 0 is true.
 */
