package c05_arrays;

public class ContainerWithMaxWater {
	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
	}

	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;

		int maxArea = 0;

		while (left < right) {
			int width = right - left;

			// The shorter line determines the water height
			int h = Math.min(height[left], height[right]);

		}

	}

}
