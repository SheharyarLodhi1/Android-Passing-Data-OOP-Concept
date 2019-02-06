package com.next.sheharyar.calculatoroop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculateStudentGpa extends AppCompatActivity {

    TextView textGpa;
    EditText edtClassOneNum, edtClassOneGrade, edtClassTwoNum, edtClassTwoGrade, edtClassThreeNum, edtClassThreeGrade, edtClassFourNum, cedtClassFourGrade;
    Button calculateGpaStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_student_gpa);

        textGpa = (TextView)findViewById(R.id.currentGpa);
        edtClassOneNum = (EditText)findViewById(R.id.edtClassOneNum);
        edtClassTwoNum = (EditText)findViewById(R.id.edtClassTwoNum);
        edtClassThreeNum = (EditText)findViewById(R.id.edtClassThreeNum);
        edtClassFourNum = (EditText)findViewById(R.id.edtClassFourNum);
        edtClassOneGrade = (EditText)findViewById(R.id.edtClassOneGrade);
        edtClassTwoGrade =(EditText)findViewById(R.id.edtClassTwoGrade);
        edtClassThreeGrade =(EditText)findViewById(R.id.edtClassThreeGrade);
        cedtClassFourGrade =(EditText)findViewById(R.id.edtClassFourGrade);

        calculateGpaStudent  =(Button)findViewById(R.id.btnCalculateGpa);

        showGpaForCurrentStudent();
    }

    private void showGpaForCurrentStudent() {
        calculateGpaStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String edtTextClassOne = edtClassOneNum.getText().toString();
                String edtTextClassOneGrade = edtClassOneGrade.getText().toString();
                String edtTextClassTwo = edtClassTwoNum.getText().toString();
                String edtTextclassTwoGrade = edtClassTwoGrade.getText().toString();
                String edtTextClassThree = edtClassThreeNum.getText().toString();
                String edtTextClassThreeGrade = edtClassThreeGrade.getText().toString();
                String edtTextClassFour = edtClassFourNum.getText().toString();
                String edtTextFourGrade = cedtClassFourGrade.getText().toString();

                GpaCalculatorSimulatorForStudent gpaCalulatorForStudent = new GpaCalculatorSimulatorForStudent(edtTextClassOne, edtTextClassTwo, edtTextClassThree, edtTextClassFour, edtTextClassOneGrade, edtTextclassTwoGrade, edtTextClassThreeGrade, edtTextFourGrade);

//                gpaCalulatorForStudent.addAllTotalPoints();
//                int percentTotal = gpaCalulatorForStudent.getTotalForClassOne();
//                ttlPercentage = (TextView)findViewById(R.id.totalPercentage);
//                ttlPercentage.setText("Percentage is : "+ percentTotal);


            }
        });

    }
}
