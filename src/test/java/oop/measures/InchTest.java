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

}