package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/4/2019.
 */

public interface GpaCalculatorInterface {
    double getTotalForClassOne();
    double getTotalForClassTwo();
    double getTotalForClassThree();
    double getTotalForClassFour();
    void checkClassOneGradesToShowGpa();
    void checkClassTwoGradesToShowGpa();
    void checkClassThreeGradesToShowGpa();
    void checkClassFourGradesToShowGpa();
    void addAllTotalPoints();
    void addAllTotalCredits();

}
