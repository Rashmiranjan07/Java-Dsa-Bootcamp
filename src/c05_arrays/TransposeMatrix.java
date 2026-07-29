/* Transpose matrix-
 * ----------------
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
 */

package c05_arrays;

public class TransposeMatrix {
	public static void main(String[] args) {

		TransposeMatrix obj = new TransposeMatrix();
		int[][] result = obj.transpose(null);
		System.out.println(result);
		
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

	public int[][] transpose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] transpose = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		

		return transpose;

	}

}
