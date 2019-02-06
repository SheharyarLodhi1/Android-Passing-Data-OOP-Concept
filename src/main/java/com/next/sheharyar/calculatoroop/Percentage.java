package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/3/2019.
 */

public class Percentage {

    private double percentageNumOne;
    private double percentageNumTwo;
    private double totalPercentage;

    public Percentage(double percentageNumOne, double percentageNumTwo, double totalPercentage) {
        this.percentageNumOne = percentageNumOne;
        this.percentageNumTwo = percentageNumTwo;
        this.totalPercentage = totalPercentage;
    }

    public double getPercentageNumOne() {
        return percentageNumOne;
    }

    public void setPercentageNumOne(double percentageNumOne) {
        this.percentageNumOne = percentageNumOne;
    }

    public double getPercentageNumTwo() {
        return percentageNumTwo;
    }

    public void setPercentageNumTwo(double percentageNumTwo) {
        this.percentageNumTwo = percentageNumTwo;
    }

    public double getTotalPercentage() {
        return totalPercentage;
    }

    public void setTotalPercentage(double totalPercentage) {
        this.totalPercentage = totalPercentage;
    }
}
