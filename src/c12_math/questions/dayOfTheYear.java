package c12_math.questions;

public class dayOfTheYear {
	public static void main(String[] args) {
		String date = "2019-01-09";
	}

	public int dayOfYear(String date) {
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));

	}

}
