package c05_searching.linear_search;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
		int target = 19;
		int ans = linearSearch(nums, target);
		System.out.println(ans);

	}

	// search the target and return the element
	static int linearSearch2(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		// run a for loop
		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}

		// this line will excute if none of the return statements above have excuted
		// hence the target not found
		return -1;

	}

	// search in the array : return the index if item found
	// otherwise if item not found return -1
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		// run a for loop
		for (int i = 0; i < arr.length - 1; i++) {
			// check for element at every index if it is = target
			int element = arr[i];

			if (element == target) {
				return i;
			}
		}

		// this line will excute if none of the return statements above have excuted
		// hence the target not found
		return -1;

	}

}
