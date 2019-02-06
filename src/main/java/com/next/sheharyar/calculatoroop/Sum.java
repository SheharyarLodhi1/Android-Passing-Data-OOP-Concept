package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/3/2019.
 */

public class Sum {
    private int numOne;
    private int numTwo;
    private int sumTotal;

    public Sum(int numOne, int numTwo, int sumTotal) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.sumTotal = sumTotal;
    }


    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    public int getSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(int sumTotal) {
        this.sumTotal = sumTotal;
    }
}
