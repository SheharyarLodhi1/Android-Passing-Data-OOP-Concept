package com.next.sheharyar.calculatoroop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtSumOne, edtSumTwo, edtMulOne, edtMulTwo, edtSubTwo, edtDivTwo, edtPercentTwo, edtDivOne, edtSubOne, edtPercentageOne;
    TextView ttlSum, ttlSubtract, ttlMultiply, ttlDiv, ttlPercentage, buttonSumTotal, buttonMulTotal, buttonSubTotal, buttonDivTotal, buttonpercentTotal, factorialText;
    boolean buttonPressed;
    Button buttonSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initViews
        edtPercentageOne = (EditText) findViewById(R.id.editPercentageOne);
        edtPercentTwo = (EditText)findViewById(R.id.editPercentageTwo);
        edtSumOne = (EditText)findViewById(R.id.editSumOne);
        edtSumTwo = (EditText)findViewById(R.id.editSumTwo);
        edtSubOne = (EditText)findViewById(R.id.editSubtractOne);
        edtSubTwo = (EditText)findViewById(R.id.editSubtractTwo);
        edtDivTwo = (EditText)findViewById(R.id.editDivisionTwo);
        edtMulOne = (EditText)findViewById(R.id.editMultiiplyOne);
        edtMulTwo = (EditText)findViewById(R.id.editMultiplyTwo);
        edtDivOne = (EditText)findViewById(R.id.editDivisionOne);
        buttonSumTotal = (TextView)findViewById(R.id.btnSumTotals);
        buttonSubTotal = (TextView)findViewById(R.id.btnSubTotals);
        buttonMulTotal = (TextView)findViewById(R.id.btnMulTotals);
        buttonDivTotal = (TextView)findViewById(R.id.btnDivTotals);
        buttonpercentTotal = (TextView)findViewById(R.id.btnPercentTotals);


//        ttlSum = (TextView)findViewById(R.id.totalNumSum);
        ttlSubtract = (TextView)findViewById(R.id.totalSubtract);
        ttlMultiply = (TextView)findViewById(R.id.totalmulti);
        ttlDiv = (TextView)findViewById(R.id.totalDivision);
        factorialText = (TextView)findViewById(R.id.factorialText);

        factorialText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FactorialAndGpa.class));
            }
        });

        showTotalSum();
        showTotalMul();
        showTotalDiv();
        showTotalSubtract();
        showTotalPercentage();

//        String sumOne = edtSumOne.getText().toString();
//        String sumTwo = edtSumTwo.getText().toString();
//        String mul = edtMul.getText().toString();
//        String subtract = edtSub.getText().toString();
//        String div = edtDiv.getText().toString();
//
//        getValueFromEdtText value = new getValueFromEdtText(sumOne, sumTwo);
//        value.setEdtTextOneValue(sumOne);
//        value.setEdtTextTwoValue(sumTwo);



//        try{
//
//            Bundle extras =  new Bundle();
//            extras.putString("SUM_KEY", sum);
//            extras.putString("SUB_KEY", subtract);
//            extras.putString("MUL_KEY", mul);
//            extras.putString("DIV_KEY", div);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }

    private void showTotalPercentage() {
        buttonpercentTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String PercentOne = edtPercentageOne.getText().toString();
                String PercentTwo = edtPercentTwo.getText().toString();

                getValueFromEdtText value = new getValueFromEdtText(PercentOne, PercentTwo);
                value.setEdtTextOneValue(PercentOne);
                value.setEdtTextTwoValue(PercentTwo);

                CalculatorSimulator clcPercent = new CalculatorSimulator(PercentOne, PercentTwo);
                clcPercent.percentageNum();
                int percentTotal = clcPercent.getTotalPercentage();
                ttlPercentage = (TextView)findViewById(R.id.totalPercentage);
                ttlPercentage.setText("Percentage is : "+ percentTotal);
            }
        });
    }

    private void showTotalMul() {
        buttonMulTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mulOne = edtMulOne.getText().toString();
                String mulTwo = edtMulTwo.getText().toString();
                getValueFromEdtText value = new getValueFromEdtText(mulOne, mulTwo);
                value.setEdtTextOneValue(mulOne);
                value.setEdtTextTwoValue(mulTwo);

                CalculatorSimulator clcMul = new CalculatorSimulator(mulOne, mulTwo);
                clcMul.multiplicationNum();
                int mulTotal = clcMul.getMultiplicationTotal();
                ttlMultiply = (TextView)findViewById(R.id.totalmulti);
                ttlMultiply.setText("Multiplication is : "+ mulTotal);
            }
        });
    }

    private void showTotalDiv() {
        buttonDivTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String divOne = edtDivOne.getText().toString();
                String divTwo = edtDivTwo.getText().toString();
                getValueFromEdtText value = new getValueFromEdtText(divOne, divTwo);
                value.setEdtTextOneValue(divOne);
                value.setEdtTextTwoValue(divTwo);

                CalculatorSimulator clcDiv = new CalculatorSimulator(divOne, divTwo);
                clcDiv.divisionNum();
                double divTotal = clcDiv.getDivisionTotal();
                ttlDiv = (TextView)findViewById(R.id.totalDivision);
                ttlDiv.setText("Division is : "+ divTotal);

            }
        });
    }

    private void showTotalSubtract() {

        buttonSubTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subOne = edtSubOne.getText().toString();
                String subTwo = edtSubTwo.getText().toString();
                getValueFromEdtText value = new getValueFromEdtText(subOne, subTwo);
                value.setEdtTextOneValue(subOne);
                value.setEdtTextTwoValue(subTwo);

                CalculatorSimulator clcSub = new CalculatorSimulator(subOne, subTwo);
                clcSub.subtractNum();
                double subTotal = clcSub.getSubtractTotal();
                ttlSubtract = (TextView)findViewById(R.id.totalSubtract);
                ttlSubtract.setText("Subtraction is : "+ subTotal);
            }
        });
    }

    public void showTotalSum(){
        buttonSumTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sumOne = edtSumOne.getText().toString();
                String sumTwo = edtSumTwo.getText().toString();
//                String mul = edtMulOne.getText().toString();
//                String subtract = edtSubOne.getText().toString();
//                String div = edtDivOne.getText().toString();

                getValueFromEdtText value = new getValueFromEdtText(sumOne, sumTwo);
                value.setEdtTextOneValue(sumOne);
                value.setEdtTextTwoValue(sumTwo);

                CalculatorSimulator clc = new CalculatorSimulator(sumOne, sumTwo);
                clc.addNum();
                int sumTotal = clc.getSumTotals();
                ttlSum = (TextView)findViewById(R.id.totalNumSum);
                ttlSum.setText("Sum is : "+ sumTotal);
            }
        });

    }
}
