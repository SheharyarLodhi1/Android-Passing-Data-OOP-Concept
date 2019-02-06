package com.next.sheharyar.calculatoroop;

import android.nfc.Tag;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by sheharyar on 2/4/2019.
 */

public class GpaCalculatorSimulatorForStudent extends GetValuesForGpaFromEdtText implements GpaCalculatorInterface {

    double classOneNum;
    double classTwoNum;
    double classThreeNum;
    double classFourNum;
    String classGrade = "";
    double gradeValue1 = 0;
    double gradeValue2 = 0;
    double gradeValue3 = 0;
    double gradeValue4 = 0;
    double TotalGrade = 0;
    double totalGpa;
    double totalPointsForClassOne = 0;
    double totalPointsForClassTwo = 0;
    double totalPointsForClassThree = 0;
    double totalPointsForClassFour = 0;
    double totalPointsOne;
    double totalPointsTwo;
    double totalPointsThree;
    double totalPointsFour;
    double totalCredits = 0;
    boolean grades;

    public GpaCalculatorSimulatorForStudent(String getValueEditOne, String getValueEditTwo, String getValueEditThree, String getValueEditFour, String getValueEditFive, String getValueEditSix, String getValueEditSeven, String getValueEditEight) {
        super(getValueEditOne, getValueEditTwo, getValueEditThree, getValueEditFour, getValueEditFive, getValueEditSix, getValueEditSeven, getValueEditEight);
    }

    @Override
    public double getTotalForClassOne() {
        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalPointsClassOne = gpaCalulatorForStudent.getTotalPointsOne();
//        addAllTotalPoints(totalPointsClassOne);
        return (int) totalPointsOne;

    }

    @Override
    public double getTotalForClassTwo() {
        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalPointsForClassTwo = gpaCalulatorForStudent.getTotalPointsTwo();
        return (int) totalPointsTwo;
    }

    @Override
    public double getTotalForClassThree() {
        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalPointsForClassThree = gpaCalulatorForStudent.getTotalPointsThree();
        return (int) totalPointsThree;
    }

    @Override
    public double getTotalForClassFour() {
        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalPointsForClassFour = gpaCalulatorForStudent.getTotalPointsFour();
        return (int) totalPointsFour;
    }

    @Override
    public void checkClassOneGradesToShowGpa() {
        String classOneNumber = GpaCalculatorSimulatorForStudent.super.getGetValueEditOne(); // classOneNum
        String classOneGrade = GpaCalculatorSimulatorForStudent.super.getGetValueEditTwo(); // class One Grade


        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        gpaCalulatorForStudent.setCreditOne(Integer.parseInt((String) classOneNumber));
        gpaCalulatorForStudent.setGradesValueOne(Integer.parseInt((String) classOneGrade));


        classGrade = classOneGrade;
        if (classGrade.equals("A")){
            gradeValue1 = 4.00;
        } else if (classGrade.equals("B")){
            gradeValue1 = 3.00;
        } else if (classGrade.equals("C")){
            gradeValue1 = 2.00;
        } else if (classGrade.equals("F")){
            gradeValue1 = 0;
        } else if (classGrade.equals("FX")){
            gradeValue1 = 0;
        }
        else
            System.out.println("Invalid Grade ..");
            totalPointsForClassOne = gradeValue1 * gpaCalulatorForStudent.getCreditOne();
//        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
            totalPointsOne = totalPointsForClassOne;

            gpaCalulatorForStudent.setTotalPointsOne(totalPointsForClassOne);


    }

    @Override
    public void checkClassTwoGradesToShowGpa() {

        String classTwoNumber = GpaCalculatorSimulatorForStudent.super.getGetValueEditThree();
        String classTwoGrade = GpaCalculatorSimulatorForStudent.super.getGetValueEditFour();

        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        gpaCalulatorForStudent.setCreditTwo(Integer.parseInt((String) classTwoNumber));
        gpaCalulatorForStudent.setGradesValueTwo(Integer.parseInt((String) classTwoGrade));

        classGrade = classTwoNumber;
        if (classGrade.equals("A")){
            gradeValue2 = 4.00;
        } else if (classGrade.equals("B")){
            gradeValue2 = 3.00;
        } else if (classGrade.equals("C")){
            gradeValue2 = 2.00;
        } else if (classGrade.equals("F")){
            gradeValue2 = 0;
        } else if (classGrade.equals("FX")){
            gradeValue2 = 0;
        }
        else
            System.out.println("Invalid Grade ..");
        totalPointsForClassTwo = gradeValue2 * gpaCalulatorForStudent.getCreditTwo();
        gpaCalulatorForStudent.setTotalPointsTwo(totalPointsForClassTwo);
    }

    @Override
    public void checkClassThreeGradesToShowGpa() {

        String classThreeNumber =  GpaCalculatorSimulatorForStudent.super.getGetValueEditFive();
        String classThreeGrade =  GpaCalculatorSimulatorForStudent.super.getGetValueEditSix();

        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        gpaCalulatorForStudent.setCreditThree(Integer.parseInt((String) classThreeNumber));
        gpaCalulatorForStudent.setGradesValueThree(Integer.parseInt((String) classThreeGrade));

        classGrade = classThreeNumber;
        if (classGrade.equals("A")){
            gradeValue3 = 4.00;
        } else if (classGrade.equals("B")){
            gradeValue3 = 3.00;
        } else if (classGrade.equals("C")){
            gradeValue3 = 2.00;
        } else if (classGrade.equals("F")){
            gradeValue3 = 0;
        } else if (classGrade.equals("FX")){
            gradeValue3 = 0;
        }
        else
            System.out.println("Invalid Grade ..");
        totalPointsForClassThree = gradeValue3 * gpaCalulatorForStudent.getCreditThree();
        gpaCalulatorForStudent.setTotalPointsThree(totalPointsForClassThree);
    }

    @Override
    public void checkClassFourGradesToShowGpa() {

        String classFourNumber =  GpaCalculatorSimulatorForStudent.super.getGetValueEditSeven();
        String classFourGrade =  GpaCalculatorSimulatorForStudent.super.getGetValueEditEight();

        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        gpaCalulatorForStudent.setCreditFour(Integer.parseInt((String) classFourNumber));
        gpaCalulatorForStudent.setGradesValueFour(Integer.parseInt((String) classFourGrade));

        classGrade = classFourNumber;
        if (classGrade.equals("A")){
            gradeValue4 = 4.00;
        } else if (classGrade.equals("B")){
            gradeValue4 = 3.00;
        } else if (classGrade.equals("C")){
            gradeValue4 = 2.00;
        } else if (classGrade.equals("F")){
            gradeValue4 = 0;
        } else if (classGrade.equals("FX")){
            gradeValue4 = 0;
        }
        else
            System.out.println("Invalid Grade ..");
        totalPointsForClassFour = gradeValue4 * gpaCalulatorForStudent.getCreditFour();
        gpaCalulatorForStudent.setTotalPointsFour(totalPointsForClassFour);
    }

    @Override
    public void addAllTotalPoints() {
        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalPtsOne = gpaCalulatorForStudent.getTotalPointsOne();
        double totalPtsTwo = gpaCalulatorForStudent.getTotalPointsTwo();
        double totalPtsThree = gpaCalulatorForStudent.getTotalPointsThree();
        double totalPtsFour = gpaCalulatorForStudent.getTotalPointsFour();

        double subTotal = totalPtsOne + totalPtsTwo + totalPtsThree + totalPtsFour;

    }

    @Override
    public void addAllTotalCredits() {

        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalCreditOne = gpaCalulatorForStudent.getGradesValueOne();
        double totalCreditTwo = gpaCalulatorForStudent.getGradesValueTwo();
        double totalCreditThree = gpaCalulatorForStudent.getGradesValueThree();
        double totalCreditFour = gpaCalulatorForStudent.getGradesValueFour();

        double subTotalCredits = totalCreditOne + totalCreditTwo + totalCreditThree + totalCreditFour;



    }
}
