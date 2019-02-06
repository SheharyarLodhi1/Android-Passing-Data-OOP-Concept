package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/3/2019.
 */

public class Division {

    private double divisionNumOne;
    private double divisionNumTwo;
    private double divisionTotal;

    public Division(double divisionNumOne, double divisionNumTwo, double divisionTotal) {
        this.divisionNumOne = divisionNumOne;
        this.divisionNumTwo = divisionNumTwo;
        this.divisionTotal = divisionTotal;
    }

    public double getDivisionNumOne() {
        return divisionNumOne;
    }

    public void setDivisionNumOne(double divisionNumOne) {
        this.divisionNumOne = divisionNumOne;
    }

    public double getDivisionNumTwo() {
        return divisionNumTwo;
    }

    public void setDivisionNumTwo(double divisionNumTwo) {
        this.divisionNumTwo = divisionNumTwo;
    }

    public double getDivisionTotal() {
        return divisionTotal;
    }

    public void setDivisionTotal(double divisionTotal) {
        this.divisionTotal = divisionTotal;
    }
}
