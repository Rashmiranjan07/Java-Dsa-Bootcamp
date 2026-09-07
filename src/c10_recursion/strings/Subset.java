// Subset = Taking any numbers from aray may or may not be adjecent 
//ex- [3,5,9] = [3], [3,5],[3,9],[3,5,9],[5,9]

package c10_recursion.strings;

import java.util.ArrayList;

public class Subset {
	public static void main(String[] args) {
//		subseq("", "abc");
		System.out.println(subseqRet("", "abc"));
	}

	static void subseq(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);
		subseq(p, up.substring(1));
		subseq(p + ch, up.substring(1));
	}

	// what if we added in an array List

	static ArrayList<String> subseqRet(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> left = subseqRet(p + ch, up.substring(1));
		ArrayList<String> right = subseqRet(p, up.substring(1));

		left.addAll(right);
		return left;
	}

}
