package oop.measures;

public abstract class MeasureConvert {

    private double conversionFactor = 0.0;

    static double convert(double n, double factor){ return n * factor; };

    public void setConversionFactor(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double conversion(double n){
        return convert(n, conversionFactor);
    }
}
