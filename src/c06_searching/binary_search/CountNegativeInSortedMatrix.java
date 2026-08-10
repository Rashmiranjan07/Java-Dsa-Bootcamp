package c06_searching.binary_search;

public class CountNegativeInSortedMatrix {
	public static void main(String[] args) {
		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
		CountNegativeInSortedMatrix obj = new CountNegativeInSortedMatrix();
		int result = obj.countNegatives(grid);
		System.out.println(result);

	}

	public int countNegatives(int[][] grid) {

		int count = 0;
		int n = grid[0].length;

		for (int[] row : grid) {
			int start = 0;
			int end = n - 1;
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (row[mid] < 0) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			count += n - start;
		}
		return count;
	}

}
