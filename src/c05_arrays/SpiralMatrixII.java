/* Spiral matrix II
----------------------
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
Example 1:
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]
 */

package c05_arrays;

import java.util.List;

public class SpiralMatrixII {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 },
				           { 4, 5, 6 }, 
				           { 7, 8, 9 } 
				           };

		SpiralMatrix obj = new SpiralMatrix();
		List<Integer> result = obj.spiralOrder(matrix);
		System.out.println(result);

	}

	public int[][] generateMatrix(int n) {

		int[][] matrix = new int[n][n];

		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;

		int num = 1;

		while (top <= bottom && left <= right) {

			// Fill top row (Left -> Right)
			for (int j = left; j <= right; j++) {
				matrix[top][j] = num++;
			}
			top++;

			// Fill right column (Top -> Bottom)
			for (int i = top; i <= bottom; i++) {
				matrix[i][right] = num++;
			}
			right--;

			// Fill bottom row (Right -> Left)
			if (top <= bottom) {
				for (int j = right; j >= left; j--) {
					matrix[bottom][j] = num++;
				}
				bottom--;
			}

			// Fill left column (Bottom -> Top)
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					matrix[i][left] = num++;
				}
				left++;
			}
		}

		return matrix;

	}

}
