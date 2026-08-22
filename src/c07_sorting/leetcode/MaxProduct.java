/* 1464 .Maximum Product of Two Elements in an Array ( easy)

 */



package c07_sorting.leetcode;

public class MaxProduct {
	public static void main(String[] args) {
		int nums[] = { 3, 4, 5, 2 };
		MaxProduct obj = new MaxProduct();
		int result = obj.maxProduct(nums);
		System.out.println(result);

	}

	public int maxProduct(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}

			}
		}
		int n = nums.length;
		int product = (nums[n - 1] - 1) * (nums[n - 2] - 1);

		return product;

	}

}
