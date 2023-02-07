package oop.measures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GallonToLiterConverterTest {
    @Test
    public void itShouldConvertGallonsToLiters() {
        double actual = new GallonToLiterConverter().conversion(1);

        assertEquals(3.7854, actual);
    }

}