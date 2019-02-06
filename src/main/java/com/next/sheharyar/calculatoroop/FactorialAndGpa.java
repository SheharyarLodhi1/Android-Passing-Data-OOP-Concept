package com.next.sheharyar.calculatoroop;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FactorialAndGpa extends AppCompatActivity {

    EditText edtFactorialNum;
    TextView txtFactorialTotal;
    Button calcultaeFact, goToNextGpaCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial_and_gpa);

        edtFactorialNum = (EditText)findViewById(R.id.editFactorialNum);
        txtFactorialTotal = (TextView)findViewById(R.id.factorialTotal);
        calcultaeFact = (Button)findViewById(R.id.btnCalculateFact);

        goToNextGpaCalculator = (Button)findViewById(R.id.btnGoToNext);

        goToNextGpaCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CalculateStudentGpa.class));
            }
        });

        showTotalOfFactorialNumber();
    }

    private void showTotalOfFactorialNumber() {
        calcultaeFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ValueOne = edtFactorialNum.getText().toString();

                GetSingleValueFromEdtText value = new GetSingleValueFromEdtText(ValueOne);
                value.setEdtTextOneValue(ValueOne);

                FactorialSimulator clcFact = new FactorialSimulator(ValueOne);
                clcFact.factorialNum();
                int factTotal = clcFact.getFactorialTotal();
                txtFactorialTotal.setText("Factorila num is : "+ factTotal);
            }
        });
    }
}
