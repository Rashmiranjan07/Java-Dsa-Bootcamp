/* 1154. Day of the Year (Easy)
--------------------------------
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

Example 1:
Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.

Example 2:
Input: date = "2019-02-10"
Output: 41

 */



package c12_math.questions;

public class dayOfTheYear {
	public static void main(String[] args) {
		String date = "2019-02-11";
		dayOfTheYear obj = new dayOfTheYear();
		int result = obj.dayOfYear(date);
		System.out.println(result);
	}

	public int dayOfYear(String date) {
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Leap year
		if (isLeapYear(year)) {
			days[1] = 29;
		}

		int result = day;

		for (int i = 0; i < month - 1; i++) {
			result += days[i];
		}

		return result;
	}

	private boolean isLeapYear(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

}
