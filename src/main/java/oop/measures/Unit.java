package oop.measures;

import java.util.Objects;

public abstract class Unit {

    private double value;

    public Unit(double value) {
        this.value = value;
    }

    public abstract Unit add(Unit unit);

    public abstract Unit from(Unit unit);

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit)) return false;
        Unit unit = (Unit) o;
        return Double.compare(unit.getValue(), getValue()) == 0;
    }
}
