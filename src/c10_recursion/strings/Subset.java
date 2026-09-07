// Subset = Taking any numbers from aray may or may not be adjecent 
//ex- [3,5,9] = [3], [3,5],[3,9],[3,5,9],[5,9]

package c10_recursion.strings;

public class Subset {
	public static void main(String[] args) {
		subseq("", "abc");
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

}
