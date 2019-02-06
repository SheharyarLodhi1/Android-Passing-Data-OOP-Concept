package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/3/2019.
 */

public class Multiplication {
    private int multiplicationNumOne;
    private int multiplicationNumTwo;
    private int totalMultiplication;

    public Multiplication(int multiplicationNumOne, int multiplicationNumTwo, int totalMultiplication) {
        this.multiplicationNumOne = multiplicationNumOne;
        this.multiplicationNumTwo = multiplicationNumTwo;
        this.totalMultiplication = totalMultiplication;
    }

    public int getMultiplicationNumOne() {
        return multiplicationNumOne;
    }

    public void setMultiplicationNumOne(int multiplicationNumOne) {
        this.multiplicationNumOne = multiplicationNumOne;
    }

    public int getMultiplicationNumTwo() {
        return multiplicationNumTwo;
    }

    public void setMultiplicationNumTwo(int multiplicationNumTwo) {
        this.multiplicationNumTwo = multiplicationNumTwo;
    }

    public int getTotalMultiplication() {
        return totalMultiplication;
    }

    public void setTotalMultiplication(int totalMultiplication) {
        this.totalMultiplication = totalMultiplication;
    }
}
