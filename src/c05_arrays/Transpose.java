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

		int left = matrix.length;
		int right = matrix[0].length;
		int[][] newMatrix = new int[left][right];
		for (int i = 0; i < left; i++) {
			for (int j = 0; j < right; j++) {
				newMatrix[j][i] = matrix[i][j];
			}
		}

		return newMatrix;

	}

}
