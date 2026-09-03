/* Number 

 */

package c08_strings.leetcode;

public class NumberOf1sSubStr {
	public static void main(String[] args) {
		String s = "101";
		NumberOf1sSubStr obj = new NumberOf1sSubStr();
		int result = obj.numSub(s);
		System.out.println(result);
	}

	public int numSub(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);

				if (sub.indexOf('0') == -1) {
					count++;
				}
			}
		}
		return count;
	}

}
