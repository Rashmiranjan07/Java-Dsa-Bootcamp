// print the subsequence with the value of ASCII value 

package c10_recursion.strings;

import java.util.ArrayList;

public class SubseqAscii {
	public static void main(String[] args) {
//		subseqAscii("", "abc");
		System.out.println(subseqAsciiRet("", "abc"));
	}

	static void subseqAscii(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subseqAscii(p + ch, up.substring(1));
		subseqAscii(p, up.substring(1));
		subseqAscii(p + (ch + 0), up.substring(1));
	}

	static ArrayList<String> subseqAsciiRet(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
		ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
		ArrayList<String> third = subseqAsciiRet(p + (ch + 0), up.substring(1));

		first.addAll(second);
		first.addAll(third);
		return first;
	}
}
