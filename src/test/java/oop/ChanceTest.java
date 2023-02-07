package oop;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {


    @Test
    public void itShouldProbabilityGettingSix() {
        Chance chance = new Chance();

        Double actual = chance.calculateProbability(6);

        double expected = 0.16667;
        assertEquals(expected, actual, 0.0001d);
    }

    @Test
    public void itShouldReturnProbabilityOfNotGettingSix() {

        Chance chance = new Chance();

        Double actual = chance.calculateImprobability(6);

        double expected = 0.83333;
        assertEquals(expected, actual, 0.0001d);
    }

    @Test
    public void itShouldReturnProductOfTwoChances(){
        Chance chance = new Chance(0.1);

        Double actual = chance.productOf( 0.2);

        assertEquals( 0.02, actual, 0.001d);
    }

    @Test
    public void itShouldReturnLogicalOfTwoChances() {
        Chance chance = new Chance(0.1);

        Double actual = chance.logicalOrOf(0.2);

        Double expected = 0.28;

        assertEquals(expected,actual, 0.001d);
    }
}
