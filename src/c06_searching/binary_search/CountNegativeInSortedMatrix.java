/* 1351. Coutinng Negative numbers in a sorted matrix 
  --------------------------------------------------- 
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0

 */

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
