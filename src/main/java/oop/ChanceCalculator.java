package oop;

public class ChanceCalculator {

    public Double getProbabilityForOneScenario(int scenarios) {
        return  1.0 / scenarios;
    }

    public Double getProbabilityOfNotGettingOneScenario(int scenarios) {
        return 1.0 - getProbabilityForOneScenario(scenarios);
    }

    public Double getProductOfTwoChances(double firstChance, double secondChance) {
        return firstChance * secondChance;
    }

    public Double getLogicalOrOfTwoChances(double firstChance, double secondChance) {
        return firstChance + secondChance - getProductOfTwoChances(firstChance, secondChance);
    }
}
