package c12_math.questions;

public class StraightLine {
	public static void main(String[] args) {
		int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };
		StraightLine obj = new StraightLine();
		boolean result = obj.checkStraightLine(coordinates);
		System.out.println(result);
	}

	public boolean checkStraightLine(int[][] coordinates) {
		int x0 = coordinates[0][0];
		int y0 = coordinates[0][1];

		int x1 = coordinates[1][0];
		int y1 = coordinates[1][1];

		for (int i = 2; i < coordinates.length; i++) {
			int x = coordinates[i][0];
			int y = coordinates[i][1];
			if ((y - y0) * (x1 - x0) != (y1 - y0) * (x - x0)) {
				return false;
			}
		}

		return true;

	}

}
