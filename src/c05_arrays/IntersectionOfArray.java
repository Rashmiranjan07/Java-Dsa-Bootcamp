package c05_arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 21 };
		int[] nums2 = { 2, 2 };

		IntersectionOfArray obj = new IntersectionOfArray();

		int[] result = obj.intersect(nums1, nums2);

		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	public int[] intersect(int[] nums1, int[] nums2) {

		List<Integer> result = new ArrayList<>();

		for (int num2 : nums2) {

			for (int num1 : nums1) {

				if (num2 == num1) {
					result.add(num2);
					break;
				}
			}
		}

		// Convert List<Integer> to int[]
		int[] output = new int[result.size()];

		for (int i = 0; i < result.size(); i++) {
			output[i] = result.get(i);
		}

		return output;
	}
}