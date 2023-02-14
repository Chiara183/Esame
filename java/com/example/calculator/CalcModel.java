package com.example.calculator;

import static java.lang.Math.*;

public class CalcModel {
    public float calculation(float num1, float num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0)
                    return 0;
                return num1 / num2;
            default:
                System.out.println("Error: Unknown operation selected");
                return 0;
        }
}
    public float squareRoot(float num1){
        return (float)sqrt(num1);
    }
    public double log(double num){
        if(num <= 0) {
            return 0;
        }
        return log10(num);
    }
}