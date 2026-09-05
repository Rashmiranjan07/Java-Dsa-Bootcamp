/* 338. Counting Bits (Easy)
 * -------------------------
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
Do not solve it with built-in functions (i.e., like __builtin_popcount in C++).

Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

 */


package c13_Bitwise;

import java.util.Arrays;

public class CountingBits {
	public static void main(String[] args) {
		int n = 5;
		CountingBits obj = new CountingBits();
		int[] result = obj.countBits(n);
		System.out.println(Arrays.toString(result));
	}

	public int[] countBits(int n) {
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 0; i <= n; i++) {
//			String binary = Integer.toBinaryString(i);
//			char[] arr = binary.toCharArray();
//
//			int count = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == '1') {
//					count++;
//				}
//
//			}
//			list.add(count);
//
//		}
//		int[] ans = new int[list.size()];
//
//		for (int i = 0; i < list.size(); i++) {
//			ans[i] = list.get(i);
//		}
//
//		return ans;

		// second method
		int[] ans = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			ans[i] = ans[i >> 1] + (i & 1);
		}

		return ans;
	}

}
