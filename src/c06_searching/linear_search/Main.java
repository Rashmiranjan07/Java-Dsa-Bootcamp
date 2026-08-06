/* Linear Search */

package c06_searching.linear_search;

import java.lang.reflect.Array;
import java.util.Arrays;

import c03_conditionals_loops.SumN;

class Main {
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

class SearchInString {
	public static void main(String[] args) {
		String name = "kunal";
		char target = 'u';
		// System.out.println(search(name, target));
		System.out.println(Arrays.toString(name.toCharArray()));
	}

	static boolean search2(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

		for (char ch : str.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}
		}

		return false;

	}
}

/*
 * search in a range arr=[18,12,-7,3,14,28]
 * 
 * Search for 3' in the range of index[1 & 4]
 * 
 */
class SearchRange {
	public static void main(String[] args) {
		int arr[] = { 18, 12, -7, 3, 14, 28 };
		int target = 3;
		System.out.println(linearSearch(arr, target, 1, 4));
	}

	static int linearSearch(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}

		// run a for loop
		for (int i = start; i <= end; i++) {
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

// find minimum element in the array 
class FindMin {
	public static void main(String[] args) {
		int arr[] = { 18, 12, -7, 3, 14, 28 };
		System.out.println(min(arr));
	}

	static int min(int arr[]) {
		if (arr.length == 0) {
			return -1;
		}

		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < ans) {
				ans = arr[i];
			}
		}

		return ans;

	}
}

class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr = { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 18, 12 } };
		int target = 34;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
		System.out.println(max(arr));
	}

	static int[] search(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}

			}
		}
		return new int[] { -1, -1 };

	}

	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max) {
					max = arr[row][col];
				}

			}
		}
		return max;

	}
}




