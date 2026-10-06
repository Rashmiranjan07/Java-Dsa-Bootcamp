package c05_arrays;

public class IntersectionOfArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 21 };
		int[] nums2 = { 2, 2 };
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

		return result;

	}

}
