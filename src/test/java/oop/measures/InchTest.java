package oop.measures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {

    @Test
    public void itShouldAddTwoInches() {
        Unit inch = new Inch(1);

        Unit actual = inch.add(new Inch(1));

        assertEquals(new Inch(2), actual);
    }

    @Test
    public void itShouldSumInchesAndMeters() {
        Unit inch = new Inch(2);
        Unit meter = new Meter(1);

        Unit expected = new Inch(41.37008);

        assertEquals(expected, inch.add(meter));
    }

}