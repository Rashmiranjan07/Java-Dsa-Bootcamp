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
