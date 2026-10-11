package c05_arrays;

public class ContainerWithMaxWater {
	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		ContainerWithMaxWater obj = new ContainerWithMaxWater();
		int result = obj.maxArea(height);
		System.out.println(result);
	}

	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;

		int maxArea = 0;

		while (left < right) {
			int width = right - left;

			int h = Math.min(height[left], height[right]);

			int area = width * h;
			maxArea = Math.max(maxArea, area);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;

	}

}
