package c08_strings.leetcode;

public class SentenseSimillarityIII {
	public static void main(String[] args) {
		String sentence1 = "My name is Haley";
		String sentence2 = "My Haley";
		SentenseSimillarityIII obj = new SentenseSimillarityIII();
		boolean result = obj.areSentencesSimilar(sentence1, sentence2);
		System.out.println(result);

	}

	public boolean areSentencesSimilar(String sentence1, String sentence2) {

		String[] a = sentence1.split(" ");
		String[] b = sentence2.split(" ");

		// Make 'a' the longer sentence
		if (a.length < b.length) {
			String[] temp = a;
			a = b;
			b = temp;
		}

		int left = 0;
		int rightA = a.length - 1;
		int rightB = b.length - 1;

		// Match words from the beginning
		while (left < b.length && a[left].equals(b[left])) {
			left++;
		}

		// Match words from the end
		while (rightB >= left && a[rightA].equals(b[rightB])) {
			rightA--;
			rightB--;
		}

		// If all words of the shorter sentence matched,
		// the sentences are similar
		return rightB < left;
	}

}
