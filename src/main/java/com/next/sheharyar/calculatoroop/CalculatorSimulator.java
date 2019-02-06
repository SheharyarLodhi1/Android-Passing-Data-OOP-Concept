package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/3/2019.
 */

public class CalculatorSimulator extends getValueFromEdtText  implements CalCulatorInterface {
    private int numOne;
    private int numTwo;
    private int numSubOne;
    private int numSubTwo;
    private int numMultiplyOne;
    private int numMultiplyTwo;
    private double numDivideOne;
    private double numDivideTwo;
    private double numPercentageOne;
    private double numPercentageTwo;
    private int totalNumOfSum ;
    private int totalNumOfSubtract;
    private int totalNumOfMultiplication;
    private int totalNumOfDivision;
    private double totalPercentage;

    public CalculatorSimulator(String edtTextOneValue, String edtTextTwoValue) {
        super(edtTextOneValue, edtTextTwoValue);
    }


    @Override
    public void addNum() {
        String one = CalculatorSimulator.super.getEdtTextOneValue();
        String two = CalculatorSimulator.super.getEdtTextTwoValue();
        Sum sum = new Sum(numOne, numTwo, totalNumOfSum);
//        String one = CalculatorSimulator.super.getEdtTextOneValue();
//        String two = CalculatorSimulator.super.getEdtTextTwoValue();
//        getValueFromEdtText values = new getValueFromEdtText(one, two);

//        sum.setNumOne(numOne);
//        sum.setNumTwo(numTwo);
        sum.setNumOne(Integer.parseInt((String) one));
        sum.setNumTwo(Integer.parseInt((String) two));
        totalNumOfSum = Integer.parseInt(one) + Integer.parseInt(two);
        sum.setSumTotal(totalNumOfSum);
    }

    @Override
    public void subtractNum() {
        String subOne = CalculatorSimulator.super.getEdtTextOneValue();
        String subTwo = CalculatorSimulator.super.getEdtTextTwoValue();
        Subtract subtract = new Subtract(numSubOne, numSubTwo, totalNumOfSubtract);
        subtract.setSubtractNumOne(Integer.parseInt((String) subOne));
        subtract.setSubtractNumTwo(Integer.parseInt((String) subTwo));
        totalNumOfSubtract = Integer.parseInt(subOne) - Integer.parseInt(subTwo);
        subtract.setSubtratcTotal(totalNumOfSubtract);
    }

    @Override
    public void multiplicationNum() {
        String mulOne = CalculatorSimulator.super.getEdtTextOneValue();
        String mulTwo = CalculatorSimulator.super.getEdtTextTwoValue();

        Multiplication multiplication = new Multiplication(numMultiplyOne, numMultiplyTwo, totalNumOfMultiplication);
        multiplication.setMultiplicationNumOne(Integer.parseInt((String) mulOne));
        multiplication.setMultiplicationNumTwo(Integer.parseInt((String) mulTwo));
        totalNumOfMultiplication = Integer.parseInt(mulOne) * Integer.parseInt(mulTwo);
        multiplication.setTotalMultiplication(totalNumOfMultiplication);
    }

    @Override
    public void divisionNum() {
        String divOne = CalculatorSimulator.super.getEdtTextOneValue();
        String divTwo = CalculatorSimulator.super.getEdtTextTwoValue();

        Division division = new Division(numDivideOne, numDivideTwo, totalNumOfDivision);
        division.setDivisionNumOne(Integer.parseInt((String) divOne));
        division.setDivisionNumTwo(Integer.parseInt((String) divTwo));
        totalNumOfDivision = Integer.parseInt(divOne) / Integer.parseInt(divTwo);
        division.setDivisionTotal(totalNumOfDivision);
    }

    @Override
    public void factorialNum() {

    }

    @Override
    public void percentageNum() {

        String percentOne = CalculatorSimulator.super.getEdtTextOneValue();
        String percentTwo = CalculatorSimulator.super.getEdtTextTwoValue();

        Percentage percentage = new Percentage(numPercentageOne, numPercentageTwo, totalPercentage);
        percentage.setPercentageNumOne(Integer.parseInt((String) percentOne));
        percentage.setPercentageNumTwo(Integer.parseInt((String) percentTwo));
        totalPercentage = Integer.parseInt(percentOne) % Integer.parseInt(percentTwo);
        percentage.setTotalPercentage(totalPercentage);
    }

    @Override
    public boolean checkPrime() {
        return false;
    }

    @Override
    public void gpaCalculator() {

    }

    @Override
    public int getSumTotals() {
        Sum sum = new Sum(numOne, numTwo, totalNumOfSum);
//        int sumTotals = totalNumOfSum;
       int sumTotals = sum.getSumTotal();
//        sum.getSumTotal();
        return sumTotals;
    }

    @Override
    public int getMultiplicationTotal() {
        Multiplication multiplication = new Multiplication(numMultiplyOne, numMultiplyTwo, totalNumOfMultiplication);
        int mulTotal = multiplication.getTotalMultiplication();
        return  mulTotal;
    }

    @Override
    public int getSubtractTotal() {
        Subtract subtract = new Subtract(numSubOne, numSubTwo, totalNumOfSubtract);
        int subTotal = subtract.getSubtratcTotal();
        return subTotal;
    }

    @Override
    public double getDivisionTotal() {
        Division division = new Division(numDivideOne, numDivideTwo, totalNumOfDivision);
        double divTotal = division.getDivisionTotal();
        return divTotal;
    }

    @Override
    public int getTotalPercentage() {
        Percentage percentage = new Percentage(numPercentageOne, numPercentageTwo, totalPercentage);
        double percentTotal = percentage.getTotalPercentage();
        return (int) percentTotal;
    }

    @Override
    public int getFactorialTotal() {
        return 0;
    }
}
