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
