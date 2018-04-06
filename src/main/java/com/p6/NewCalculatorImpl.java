package com.p6;

public class NewCalculatorImpl implements NewCalculator {
    private NewCalculator newCalculator;

    public NewCalculatorImpl(NewCalculator newCalculator) {
        this.newCalculator = newCalculator;
    }

    public double add(double d1, double d2) {
        return newCalculator.add(d1, d2);
    }

    public double subtract(double d1, double d2) {
        return newCalculator.subtract(d1, d2);
    }

    public double multiply(double d1, double d2) {
        return newCalculator.multiply(d1, d2);
    }

    public double divide(double d1, double d2) {
        return newCalculator.divide(d1, d2);
    }

    public double double15() {
        return 15.0;
    }
}
