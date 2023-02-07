package oop.measures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeterToCentimetersConverterTest {

    @Test
    public void itShouldConvertMetersToCentimeters() {

        double actual = new MetersToCentimetersConverter().conversion(2);

        assertEquals(200, actual);

    }

}