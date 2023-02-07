package oop.measures;

public class Inch extends Unit{

    private double value;
    public Inch(double value) {
        super(value);
    }

    @Override
    public Unit add(Unit obj) {
        return new Inch(this.value + obj.getValue());
    }



}
