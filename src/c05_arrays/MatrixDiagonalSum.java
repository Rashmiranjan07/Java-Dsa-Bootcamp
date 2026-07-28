/* Matrix diagonal Sum
 Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
 */

package c05_arrays;

import java.util.Arrays;

public class MatrixDiagonalSum {
	public static void main(String[] args) {

		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		MatrixDiagonalSum obj = new MatrixDiagonalSum();
		int result = obj.diagonalSum(mat);
		System.out.println(result);

	}

	public int diagonalSum(int[][] mat) {
		int n = mat.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			// primary diagonal
			sum += mat[i][i];

			// secondary diagonal
			if (i != n - 1 - i) {
				sum += mat[i][n - 1 - i];
			}
		}
		return sum;

	}

}
