/* Spiral Matrix III

 */


package c05_arrays;

import java.util.Arrays;

public class SpiralMatrixIII {
	public static void main(String[] args) {
		SpiralMatrixIII obj = new SpiralMatrixIII();
		Solution sol = obj.new Solution();

		int rows = 5;
		int cols = 6;
		int rStart = 1;
		int cStart = 4;

		int[][] result = sol.spiralMatrixIII(rows, cols, rStart, cStart);

		System.out.println("Spiral Traversal:");
		for (int[] cell : result) {
			System.out.println(Arrays.toString(cell));
		}
	}

	class Solution {
		public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

			int[][] directions = { { 0, 1 }, // Right
					{ 1, 0 }, // Down
					{ 0, -1 }, // Left
					{ -1, 0 } // Up
			};

			int n = rows * cols;
			int[][] res = new int[n][2];

			// Starting cell
			res[0][0] = rStart;
			res[0][1] = cStart;

			int count = 1;
			int step = 1;
			int index = 0;

			while (count < n) {

				// Same step size for two directions
				for (int times = 0; times < 2; times++) {

					int dr = directions[index % 4][0];
					int dc = directions[index % 4][1];

					for (int i = 0; i < step; i++) {

						rStart += dr;
						cStart += dc;

						if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {

							res[count][0] = rStart;
							res[count][1] = cStart;
							count++;
						}
					}

					index++;
				}

				step++;
			}

			return res;
		}
	}
}