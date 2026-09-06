package c13_Bitwise;

public class SetMissmatch {
	public static void main(String[] args) {

	}

	public int[] findErrorNums(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] <= arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		// Search for the first missing Number
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != j + 1) {
				return new int[] { arr[j], j + 1 };
			}
		}

		return new int[] { -1, -1 };

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}
}
