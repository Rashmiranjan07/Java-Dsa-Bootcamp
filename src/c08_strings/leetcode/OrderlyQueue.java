/*899. Orderly Queue (Hard)
 --------------------------
You are given a string s and an integer k. You can choose one of the first k letters of s and append it at the end of the string.
Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.

Example 1:
Input: s = "cba", k = 1
Output: "acb"
Explanation: 
In the first move, we move the 1st character 'c' to the end, obtaining the string "bac".
In the second move, we move the 1st character 'b' to the end, obtaining the final result "acb".

Example 2:
Input: s = "baaca", k = 3
Output: "aaabc"
Explanation: 
In the first move, we move the 1st character 'b' to the end, obtaining the string "aacab".
In the second move, we move the 3rd character 'c' to the end, obtaining the final result "aaabc".

*/

package c08_strings.leetcode;

import java.util.Arrays;

public class OrderlyQueue {
	public static void main(String[] args) {
		String s = "baaca";
		int k = 3;
		OrderlyQueue obj = new OrderlyQueue();
		String result = obj.orderlyQueue(s, k);
		System.out.println(result);

	}

	public String orderlyQueue(String s, int k) {

		// If k >= 2, we can rearrange the characters freely.
		// So sorting gives the smallest possible string.
		if (k >= 2) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			return new String(arr);
		}

		// If k == 1, only rotations are possible.
		String ans = s;

		for (int i = 1; i < s.length(); i++) {
			String rotation = s.substring(i) + s.substring(0, i);

			if (rotation.compareTo(ans) < 0) {
				ans = rotation;
			}
		}

		return ans;
	}
}
