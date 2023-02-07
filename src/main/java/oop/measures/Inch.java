package oop.measures;

public class Inch extends Unit{
    private final double METER_TO_INCH_CONVERSION_FACTOR = 39.37008;

    public Inch(double value) {
        super(value);
    }

    @Override
    public Unit add(Unit unit) {
        if(unit instanceof Meter){
            return new Inch(this.getValue() + unit.getValue() * METER_TO_INCH_CONVERSION_FACTOR);
        }
        return new Inch(this.getValue() + unit.getValue());
    }

    @Override
    public Unit from(Unit unit) {
        if(unit instanceof Meter){
            return new Inch(unit.getValue() * METER_TO_INCH_CONVERSION_FACTOR);
        }
    }
}
