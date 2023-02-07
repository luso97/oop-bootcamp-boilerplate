package oop;

import oop.measures.MeasureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasureConverterTest {

    private double delta = 0.01d;

    @Test
    public void itShouldConvertFeetToMeters() {
        double actual = MeasureConverter.feetToMeters(5);

        assertEquals(1.524,  actual, delta);
    }

    @Test
    public void itShouldConvertInchesToYard() {
        double actual = MeasureConverter.inchesToYards(5);

        assertEquals(0.1389, actual, delta);
    }

}