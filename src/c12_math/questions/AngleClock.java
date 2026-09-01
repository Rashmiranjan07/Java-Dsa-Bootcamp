/*1344. Angle Between Hands of a Clock (Medium)
  ----------------------------------------------
Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.
Answers within 10-5 of the actual value will be accepted as correct.

Example 1:
Input: hour = 12, minutes = 30
Output: 165

Example 2:
Input: hour = 3, minutes = 30
Output: 75

Example 3:
Input: hour = 3, minutes = 15
Output: 7.5

 */

package c12_math.questions;

public class AngleClock {
	public static void main(String[] args) {
		int hour = 12;
		int minutes = 30;
		AngleClock obj = new AngleClock();
		double result = obj.angleClock(hour, minutes);
		System.out.println(result);

	}

	public double angleClock(int hour, int minutes) {
		double hourAngle = hour * 30 + minutes * 0.5;
		double minuteAngle = minutes * 6;

		double difference = Math.abs(hourAngle - minuteAngle);

		return Math.min(difference, 360 - difference);
	}

}
