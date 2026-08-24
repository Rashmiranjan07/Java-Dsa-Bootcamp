package c07_sorting.leetcode;

public class MaximumProductOfThree {
	public static void main(String[] args) {
		int[] nums = { -1,-2,-3};
		MaximumProductOfThree obj = new MaximumProductOfThree();
		int result = obj.maximumProduct(nums);
		System.out.println(result);
	}

	public int maximumProduct(int[] arr) {
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
		int n = arr.length;
		int product = 1;
		for (int index = n - 1; index >= n - 3; index--) {
			product *= arr[index];

		}

		return product;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
