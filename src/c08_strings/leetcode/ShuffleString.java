/* 1528. Shuffle String (easy)
 * --------------------------


 */

package c08_strings.leetcode;

public class ShuffleString {
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		ShuffleString obj = new ShuffleString();
		String answer = obj.restoreString(s, indices);
		System.out.println(answer);

	}

	public String restoreString(String s, int[] indices) {

		char[] result = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			result[indices[i]] = s.charAt(i);
		}
		return new String(result);

	}

}