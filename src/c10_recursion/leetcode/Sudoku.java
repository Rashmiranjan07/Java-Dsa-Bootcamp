/* 37. Sudoku Solver (Hard)
-----------------------------
Write a program to solve a Sudoku puzzle by filling the empty cells.
A sudoku solution must satisfy all of the following rules:
Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.

Example 1:
Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
Explanation: The input board is shown above and the only valid solution is shown below:

 Note : - when a choice effect future actions use backtracking.
 */

package c10_recursion.leetcode;

public class Sudoku {
	public static void main(String[] args) {
		int[][] board = new int[][] { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 }, { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		if (solve(board)) {
			display(board);
		} else {
			System.out.println("Cannot solve");
		}

	}

	static boolean solve(int[][] board) {
		int n = board.length;
		int row = -1;
		int col = -1;

		boolean emptyLeft = true;

		// this is how we are replacing the r,c from arguments
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;
					emptyLeft = false;
					break;
				}
			}
			// if you found some empty element in row, then break
			if (emptyLeft == false) {
				break;
			}
		}

		if (emptyLeft == true) {
			return true;
			// soduko is solved
		}

		// backtrack
		for (int number = 1; number <= 9; number++) {
			if (isSafe(board, row, col, number)) {
				board[row][col] = number;
				if (solve(board)) {
					// found the answer
					return true;
				} else {
					// backtrack
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

	private static void display(int[][] board) {
		for (int[] row : board) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	static boolean isSafe(int[][] board, int row, int col, int num) {
		// check the row
		for (int i = 0; i < board.length; i++) {
			// check if the number is in the row
			if (board[row][i] == num) {
				return false;
			}
		}

		// check the col
		for (int[] nums : board) {
			// check if the number is in the col
			if (nums[col] == num) {
				return false;
			}
		}

		int sqrt = (int) (Math.sqrt(board.length));
		int rowStart = row - row % sqrt;
		int colStart = col - col % sqrt;

		for (int r = rowStart; r < rowStart + sqrt; r++) {
			for (int c = colStart; c < colStart + sqrt; c++) {
				if (board[r][c] == num) {
					return false;
				}
			}
		}
		return true;
	}
}
