//Matrix is sorted in a row wise or column wise manner 

package c06_searching.searching_matrix_2D;

import java.util.Arrays;

public class RowColMatrix {
	public static void main(String[] args) {
//		int[][] matrix = { 
//				{ 10, 20, 30, 40 },
//				{ 15, 25, 35, 45 }, 
//				{ 28, 29, 37, 49 }, 
//				{ 33, 34, 38, 50 }
//		};
		int[][] arr = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};
		int target = 6;
		System.out.println(Arrays.toString(search(arr, target)));

	}

	static int[] search(int[][] matrix, int target) {
		int r = 0;
		int c = matrix[0].length-1;

		while (r < matrix.length && c >= 0) {
			if (matrix[r][c] == target) {
				return new int[] { r, c };
			}
			if (matrix[r][c] < target) {
				r++;
			} else {
				c--;
			}
		}
		return new int[] { -1, -1 };
	}

}
