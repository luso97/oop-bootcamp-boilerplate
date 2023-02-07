package oop.measures;

public abstract class MeasureConvert {

    private static double conversionFactor;
    static double convert(double n){ return n * conversionFactor; };
}
