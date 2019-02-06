package com.next.sheharyar.calculatoroop;

/**
 * Created by sheharyar on 2/3/2019.
 */

public class getValueFromEdtText {

    private String edtTextOneValue;
    private String edtTextTwoValue;

    public getValueFromEdtText(String edtTextOneValue, String edtTextTwoValue) {
        this.edtTextOneValue = edtTextOneValue;
        this.edtTextTwoValue = edtTextTwoValue;
    }

    public String getEdtTextOneValue() {
        return edtTextOneValue;
    }

    public void setEdtTextOneValue(String edtTextOneValue) {
        this.edtTextOneValue = edtTextOneValue;
    }

    public String getEdtTextTwoValue() {
        return edtTextTwoValue;
    }

    public void setEdtTextTwoValue(String edtTextTwoValue) {
        this.edtTextTwoValue = edtTextTwoValue;
    }
}
