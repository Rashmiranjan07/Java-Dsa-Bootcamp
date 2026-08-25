


package c08_strings.leetcode;

public class ArrayStringsEqual {
	public static void main(String[] args) {
		String[] word1 = { "ab", "c" };
		String[] word2 = { "a", "bc" };
		ArrayStringsEqual obj = new ArrayStringsEqual();
		boolean result = obj.arrayStringsAreEqual(word1, word2);
		System.out.println(result);
	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		String result1 = word1[0] + word1[1];
		String result2 = word2[0] + word2[1];

		return result1.equals(result2);

	}

}
