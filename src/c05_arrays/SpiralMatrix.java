/* Spiral matrix
 * --------------
 Given an m x n matrix, return all elements of the matrix in spiral order.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

package c05_arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 },
				           { 4, 5, 6 }, 
				           { 7, 8, 9 } 
				           };

		SpiralMatrix obj = new SpiralMatrix();

		List<Integer> result = obj.spiralOrder(matrix);

		System.out.println(result);
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();

		if (matrix == null || matrix.length == 0) {
			return result;
		}
		int m = matrix.length - 1;
		int n = matrix[0].length - 1;

		int top = 0;
		int bottom = m;
		int left = 0;
		int right = n;
		while (top <= bottom && left <= right) {

			// Traverse Left to Right
			for (int i = left; i <= right; i++) {
				result.add(matrix[top][i]);
			}
			top++;

			// Traverse Top to Bottom
			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			// Traverse Right to Left
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			}

			// Traverse Bottom to Top
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}
		}

		return result;

	}

}
