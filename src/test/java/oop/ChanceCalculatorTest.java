package oop;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceCalculatorTest {

    @Test
    public void itShouldProbabilityGettingSix() {
        ChanceCalculator chanceCalculator = new ChanceCalculator();

        Double actual = chanceCalculator.getProbabilityForOneScenario(6);

        double expected = 0.16667;
        assertEquals(expected, actual, 0.0001d);
    }

    @Test
    public void itShouldReturnProbabilityOfNotGettingSix() {

        ChanceCalculator chanceCalculator = new ChanceCalculator();

        Double actual = chanceCalculator.getProbabilityOfNotGettingOneScenario(6);

        double expected = 0.83333;
        assertEquals(expected, actual, 0.0001d);
    }

    @Test
    public void itShouldReturnProductOfTwoChances(){
        ChanceCalculator chanceCalculator = new ChanceCalculator();

        Double actual = chanceCalculator.getProductOfTwoChances(0.1, 0.2);

        assertEquals( 0.02, actual, 0.001d);
    }

    @Test
    public void itShouldReturnLogicalOfTwoChances() {
        ChanceCalculator chanceCalculator = new ChanceCalculator();

        Double actual = chanceCalculator.getLogicalOrOfTwoChances(0.1,0.2);

        Double expected = 0.28;

        assertEquals(expected,actual, 0.001d);
    }
}
