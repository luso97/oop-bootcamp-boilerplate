package oop;

public class Chance {
    private Double probablity;

    public Chance(Double probablity) {
        this.probablity = probablity;
    }
    public Chance(){
    }

    public double calculateProbability(int scenarios) {
        return  1.0 / scenarios;
    }

    public Double calculateImprobability(int scenarios) {
        return 1.0 - calculateProbability(scenarios);
    }
    public Double productOf(double secondChance) {
        return this.probablity * secondChance;
    }
    
    public Double logicalOrOf(double secondChance) {
        return this.probablity + secondChance - this.productOf(secondChance);
    }
}
