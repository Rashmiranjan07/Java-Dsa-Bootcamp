

package c07_sorting.leetcode;

public class ThirdMaxNum {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 3, 1 };
		ThirdMaxNum obj = new ThirdMaxNum();
		int result = obj.thirdMax(nums);
		System.out.println(result);

	}

	public int thirdMax(int[] nums) {
		long first = Long.MIN_VALUE;
		long second = Long.MIN_VALUE;
		long third = Long.MIN_VALUE;

		for (int num : nums) {

			if (num == first || num == second || num == third) {
				continue;
			}

			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second) {
				third = second;
				second = num;
			} else if (num > third) {
				third = num;
			}
		}

		if (third == Long.MIN_VALUE) {
			return (int) first;
		}

		return (int) third;
	}

}
