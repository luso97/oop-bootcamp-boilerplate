package oop;

public class MeasureConverter {

    private static final double METERS_FEET_CONVERSION_FACTOR = 0.3048;
    public static final double INCHES_YARDS_CONVERSION_FACTOR = 0.0278;

    public static double feetToMeters(double feet) {
        return feet * METERS_FEET_CONVERSION_FACTOR;
    }

    public static double inchesToYards(double inches) {
        return inches * INCHES_YARDS_CONVERSION_FACTOR;
    }

    public static double yardsToInches(double yards) {
        return Double.valueOf(yards) / Double.valueOf(INCHES_YARDS_CONVERSION_FACTOR);
    }
}