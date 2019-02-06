package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/4/2019.
 */

public class FactorialSimulator extends GetSingleValueFromEdtText implements FactorialNumInterface {

    int factorilaNumOne;
    int totalFactorialNumbers;
    int factorialDefaultNum = 1;
    public FactorialSimulator(String edtTextOneValue) {
        super(edtTextOneValue);
    }

    @Override
    public int getFactorialTotal() {
        Factorial factorial = new Factorial(factorilaNumOne, factorialDefaultNum);
        int factTotal = factorial.getFact();
        return factTotal;
    }

    @Override
    public void factorialNum() {

        String factOne = FactorialSimulator.super.getEdtTextOneValue(); // lets say we have a num 5 ..
        int factorialCast = Integer.parseInt((String) factOne);
        Factorial factorial = new Factorial(factorilaNumOne, totalFactorialNumbers);
        factorial.setNum(Integer.parseInt((String) factOne));

        for (int i = 1; i <= factorialCast; i++){
            factorialDefaultNum = factorialDefaultNum * i;
            factorial.setFact(factorialDefaultNum);

        }
    }
}
