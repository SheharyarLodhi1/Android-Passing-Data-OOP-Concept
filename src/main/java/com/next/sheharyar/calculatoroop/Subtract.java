package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/3/2019.
 */

public class Subtract {

    private int subtractNumOne;
    private int subtractNumTwo;
    private int subtratcTotal;

    public Subtract(int subtractNumOne, int subtractNumTwo, int subtratcTotal) {
        this.subtractNumOne = subtractNumOne;
        this.subtractNumTwo = subtractNumTwo;
        this.subtratcTotal = subtratcTotal;
    }

    public int getSubtractNumOne() {
        return subtractNumOne;
    }

    public void setSubtractNumOne(int subtractNumOne) {
        this.subtractNumOne = subtractNumOne;
    }

    public int getSubtractNumTwo() {
        return subtractNumTwo;
    }

    public void setSubtractNumTwo(int subtractNumTwo) {
        this.subtractNumTwo = subtractNumTwo;
    }

    public int getSubtratcTotal() {
        return subtratcTotal;
    }

    public void setSubtratcTotal(int subtratcTotal) {
        this.subtratcTotal = subtratcTotal;
    }
}
