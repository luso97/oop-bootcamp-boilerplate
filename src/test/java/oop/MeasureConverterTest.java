package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasureConverterTest {

    private double delta = 0.0001d;

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

    @Test
    public void itShouldConvertYardsToInches() {
        double actual = MeasureConverter.yardsToInches(0.1389);

        assertEquals(5, actual, delta);
    }

}