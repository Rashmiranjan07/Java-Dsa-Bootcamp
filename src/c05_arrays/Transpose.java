/* Transpose matrix 
 * ----------------
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 */

package c05_arrays;

import java.util.Arrays;

public class Transpose {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Transpose obj = new Transpose();
		int[][] result = obj.transpose(matrix);

		// print the transpose matrix
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[][] transpose(int[][] matrix) {
		
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] newMatrix = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				newMatrix[j][i] = matrix[i][j];
			}
		}
		return newMatrix;
	}

}
