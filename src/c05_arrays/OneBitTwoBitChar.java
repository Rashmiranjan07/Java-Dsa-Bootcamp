/*
717. 1-bit and 2-bit Characters
Solved
Easy
Topics
premium lock icon
Companies
Hint
We have two special characters:

The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.

 

Example 1:

Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.
Example 2:

Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.
 */


package c05_arrays;

public class OneBitTwoBitChar {
	public static void main(String[] args) {
		int[] bits = { 1, 1, 1, 0 };
		OneBitTwoBitChar obj = new OneBitTwoBitChar();
		boolean result = obj.isOneBitCharacter(bits);
		System.out.println(result);
	}

	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		int n = bits.length;

		while (i < n - 1) {
			if (bits[i] == 0) {
				i++;
			} else {
				i += 2;
			}
		}

		return i == n - 1;
	}

}
